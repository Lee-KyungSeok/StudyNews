package co.kr.studynews.data.news.repository.datasource

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.news.api.provideNewsApi
import co.kr.studynews.data.news.mapper.ArticleEntityMapper
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleNetworkDataSource : ArticleDataSource {

    val api = provideNewsApi()

    override fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        return api.getCategoryHeadline(country, category, BuildConfig.NEWS_API).map {
            it.articles.map { ArticleEntityMapper.toEntity(it) }
        }
    }

    override fun headlines(country: String): Flowable<List<Article>> {
        return api.getHeadline(country, BuildConfig.NEWS_API).map {
            it.articles.map { ArticleEntityMapper.toEntity(it) }
        }
    }

    override fun article(id: Int) {
        throw UnsupportedOperationException("Operation is not available!!!")
    }
}