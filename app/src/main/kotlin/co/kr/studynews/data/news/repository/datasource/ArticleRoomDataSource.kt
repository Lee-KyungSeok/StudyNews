package co.kr.studynews.data.news.repository.datasource

import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleRoomDataSource : ArticleDataSource {
    override fun categoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun headlines(country: String): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun article(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}