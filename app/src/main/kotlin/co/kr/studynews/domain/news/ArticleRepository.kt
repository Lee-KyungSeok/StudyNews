package co.kr.studynews.domain.news

import android.arch.lifecycle.LiveData
import co.kr.studynews.entity.news.Article
import io.reactivex.Flowable

interface ArticleRepository {
    fun getCategoryArticles(country: String, category: String, page : Int) : Flowable<List<Article>>
    fun getHeadlines(country: String) : Flowable<List<Article>>
    fun searchKeywords(keywords: String, country: String, category: String) : Flowable<List<Article>>
    fun getArticleDetail(article: Article) : Flowable<Article>
    fun getRecentArticle() : Flowable<List<Article>>
}