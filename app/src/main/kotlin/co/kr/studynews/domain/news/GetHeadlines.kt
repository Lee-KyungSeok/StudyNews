package co.kr.studynews.domain.news

import co.kr.studynews.domain.base.UseCase
import co.kr.studynews.domain.executer.PostExecutionThread
import co.kr.studynews.domain.executer.ThreadExecutor
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class GetHeadlines constructor(val repository : ArticleRepository,
                   threadExecutor: ThreadExecutor,
                   postExecutionThread: PostExecutionThread
) : UseCase<List<Article>, GetHeadlines.Params>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseFlowable(params: Params): Flowable<List<Article>> {
        return repository.getHeadlines(params.country)
    }

    data class Params(val country: String)

}