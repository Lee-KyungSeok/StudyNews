package co.kr.studynews.data.news

import co.kr.studynews.data.news.api.ArticleNetworkModel
import co.kr.studynews.domain.news.ArticleRepository
import co.kr.studynews.entity.news.Article

class ArticleNetworkRepository : ArticleRepository {
    override fun getCategoryArticles(country: String, category: String, page: Int): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHeadlines(country: String): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchKeywords(keywords: String, country: String, category: String): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun saveInRoom(networkModel : ArticleNetworkModel) : ArticleRoomModel {
        TODO("구현 필요")
    }
}