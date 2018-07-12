package co.kr.studynews.domain.news

import co.kr.studynews.domain.base.UseCase
import co.kr.studynews.domain.executer.PostExecutionThread
import co.kr.studynews.domain.executer.ThreadExecutor
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class GetRecentArticles constructor(val repository: ArticleRepository,
                        threadExecutor: ThreadExecutor,
                        postExecutionThread: PostExecutionThread
) : UseCase<List<Article>, UseCase.None>(threadExecutor, postExecutionThread) {
    override fun buildUseCaseFlowable(params: None): Flowable<List<Article>> {
        return repository.getRecentArticle()
    }
}