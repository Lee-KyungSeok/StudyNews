package co.kr.studynews.domain.news

import co.kr.studynews.entity.news.Article

interface ArticleRepository {
    fun getCategoryArticles(country: String, category: String, page : Int) : List<Article>
    fun getHeadlines(country: String) : List<Article>
    fun searchKeywords(keywords: String, country: String, category: String) : List<Article>
}