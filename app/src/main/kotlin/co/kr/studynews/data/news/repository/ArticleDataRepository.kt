package co.kr.studynews.data.news.repository

import android.arch.lifecycle.MutableLiveData
import co.kr.studynews.data.news.repository.datasource.ArticleDataSourceFactory
import co.kr.studynews.domain.news.ArticleRepository
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

class ArticleDataRepository(val articleDataSourceFactory: ArticleDataSourceFactory) : ArticleRepository {

    val categoryArticles : MutableLiveData<List<Article>> = MutableLiveData()
    val headlineArticles : MutableLiveData<List<Article>> = MutableLiveData()


    override fun getCategoryArticles(country: String, category: String, page: Int): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHeadlines(country: String): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchKeywords(keywords: String, country: String, category: String): Flowable<List<Article>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArticle(id: Int): Flowable<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}