package co.kr.studynews.data.news.repository.datasource

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.news.api.NewsApi
import co.kr.studynews.data.news.mapper.ArticleEntityMapper
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleNetworkDataSource(
        val articleEntityMapper: ArticleEntityMapper,
        val api: NewsApi
) : ArticleDataSource {

    override fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        return api.getCategoryHeadline(country, category, BuildConfig.NEWS_API).map {
            it.articles.map { articleEntityMapper.toEntity(it) }
        }
    }

    override fun headlines(country: String): Flowable<List<Article>> {
        return api.getHeadline(country, BuildConfig.NEWS_API).map {
            it.articles.map { articleEntityMapper.toEntity(it) }
        }
    }

    override fun article(id: Int) {
        throw UnsupportedOperationException("Operation is not available!!!")
    }
}