package co.kr.studynews.data.local

import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleRealmDataSource {
    override fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        throw UnsupportedOperationException("Operation is not available!!!")
    }

    override fun headlines(country: String): Flowable<List<Article>> {
        throw UnsupportedOperationException("Operation is not available!!!")
    }

    override fun recentArticles(): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveArticle() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}