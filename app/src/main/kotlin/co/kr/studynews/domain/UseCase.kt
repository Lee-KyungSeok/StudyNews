package co.kr.studynews.domain

import co.kr.studynews.domain.executer.PostExecutionThread
import co.kr.studynews.domain.executer.ThreadExecutor
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

abstract class UseCase<T, Params>(
        val threadExecutor: ThreadExecutor,
        val postExecutionThread: PostExecutionThread,
        val disposables : CompositeDisposable = CompositeDisposable()
) {

    abstract fun buildUseCaseFlowable(params: Params) : Flowable<T>

    fun execute(subscriber : DisposableSubscriber<T>, params: Params) {
        val observable : Flowable<T> = this.buildUseCaseFlowable(params)
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getSceduler())
        addDisposable(observable.subscribeWith(subscriber))
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