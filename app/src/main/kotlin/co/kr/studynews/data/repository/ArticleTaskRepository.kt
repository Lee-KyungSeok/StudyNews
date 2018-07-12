package co.kr.studynews.data.repository

import co.kr.studynews.data.remote.ArticleNetworkDataSource
import co.kr.studynews.data.local.ArticleRealmDataSource
import co.kr.studynews.domain.news.ArticleRepository
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleTaskRepository constructor(
        val articleNetworkDataSource: ArticleNetworkDataSource,
        val articleRealmDataSource: ArticleRealmDataSource
) : ArticleRepository {

    override fun getCategoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        return articleNetworkDataSource.categoryArticles(country, category, page)
    }

    override fun getHeadlines(country: String): Flowable<List<Article>> {
        return articleNetworkDataSource.headlines(country)
    }

    override fun searchKeywords(keywords: String, country: String, category: String): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArticleDetail(article: Article): Flowable<Article> {

        saveArticle(article)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRecentArticle(): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveArticle(article: Article): Flowable<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}