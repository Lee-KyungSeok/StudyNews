package co.kr.studynews.data.news.repository.datasource

import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

interface ArticleDataSource {
    fun categoryArticles(country: String, category: String, page: Int) : Flowable<List<Article>>
    fun headlines(country: String) : Flowable<List<Article>>
    fun article(id: Int)
}