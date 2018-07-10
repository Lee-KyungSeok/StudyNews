package co.kr.studynews.data.news.repository.datasource

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.news.api.provideNewsApi
import co.kr.studynews.data.news.mapper.ArticleEntityMapper
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleNetworkDataSource(val articleEntityMapper: ArticleEntityMapper) : ArticleDataSource {

    override fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        return provideNewsApi().getCategoryHeadline(country, category, BuildConfig.NEWS_API).map {
            it.articles.map { articleEntityMapper.toEntity(it) }
        }
    }

    override fun headlines(country: String): Flowable<List<Article>> {
        return provideNewsApi().getHeadline(country, BuildConfig.NEWS_API).map {
            it.articles.map { articleEntityMapper.toEntity(it) }
        }
    }

    override fun article(id: Int) {
        throw UnsupportedOperationException("Operation is not available!!!")
    }
}