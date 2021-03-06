package co.kr.studynews.domain.news

import co.kr.studynews.domain.base.UseCase
import co.kr.studynews.domain.executer.PostExecutionThread
import co.kr.studynews.domain.executer.ThreadExecutor
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class GetArticleDetails constructor(val repository: ArticleRepository,
                        threadExecutor: ThreadExecutor,
                        postExecutionThread: PostExecutionThread
) : UseCase<Article, GetArticleDetails.Params>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseFlowable(params: Params): Flowable<Article> {
        return repository.getArticleDetail(params.article)
    }

    data class Params(val article: Article)
}