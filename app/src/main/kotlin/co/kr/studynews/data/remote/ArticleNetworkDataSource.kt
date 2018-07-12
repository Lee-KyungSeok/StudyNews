package co.kr.studynews.data.remote

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.remote.api.NewsApi
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleNetworkDataSource(val api: NewsApi) {

    fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        return api.getCategoryHeadline(country, category, BuildConfig.NEWS_API).map {
            it.articles?.map { articleEntityMapper.toEntity(it) }
        }
    }

    fun headlines(country: String): Flowable<List<Article>> {
        return api.getHeadline(country, BuildConfig.NEWS_API).map {
            it.articles?.map { articleEntityMapper.toEntity(it) }
        }
    }

//    fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
//        return api.getCategoryHeadline(country, category, BuildConfig.NEWS_API).map {
//            it.articles?.map { articleEntityMapper.toEntity(it) }
//        }
//    }
//
//    fun headlines(country: String): Flowable<List<Article>> {
//        return api.getHeadline(country, BuildConfig.NEWS_API).map {
//            it.articles?.map { articleEntityMapper.toEntity(it) }
//        }
//    }

}