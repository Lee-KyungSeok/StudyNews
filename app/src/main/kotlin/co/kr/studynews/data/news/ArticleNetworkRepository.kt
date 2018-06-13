package co.kr.studynews.data.news

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.news.api.ArticleNetworkModel
import co.kr.studynews.data.news.api.Response
import co.kr.studynews.data.news.api.provideNewsApi
import co.kr.studynews.domain.news.ArticleRepository
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Callback
import io.reactivex.BackpressureStrategy
import io.reactivex.FlowableEmitter



class ArticleNetworkRepository : ArticleRepository {

    val api = provideNewsApi()

    override fun getCategoryArticles(country: String, category: String, page: Int): Flowable<Article> {
        val newsRemote = api.getCategoryHeadline(country, category, BuildConfig.NEWS_API)
        return Flowable.create({emitter ->
            
        }, BackpressureStrategy.BUFFER)
    }

    override fun getHeadlines(country: String): Flowable<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchKeywords(keywords: String, country: String, category: String): Flowable<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun saveInRoom(networkModel : ArticleNetworkModel) : ArticleRoomModel {
        TODO("구현 필요")
    }
}