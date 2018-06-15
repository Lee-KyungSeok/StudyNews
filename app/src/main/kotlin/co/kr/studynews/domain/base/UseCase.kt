package co.kr.studynews.domain.base

import co.kr.studynews.domain.executer.PostExecutionThread
import co.kr.studynews.domain.executer.ThreadExecutor
import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

abstract class UseCase<T, Params>(
        val threadExecutor: ThreadExecutor,
        val postExecutionThread: PostExecutionThread,
        val disposables : CompositeDisposable = CompositeDisposable()
) {

    abstract fun buildUseCaseFlowable(params: Params) : Flowable<T>

    fun execute(subscriber : DisposableSubscriber<T>, params: Params) {
        val flowable : Flowable<T> = this.buildUseCaseFlowable(params)
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getSceduler())
        addDisposable(flowable.subscribeWith(subscriber))
    }

    fun dispose() {
        if(disposables.isDisposed) {
            disposables.dispose()
        }
    }

    private fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }
}