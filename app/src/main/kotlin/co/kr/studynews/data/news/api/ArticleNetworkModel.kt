package co.kr.studynews.data.news.api

data class ArticleNetworkModel (
        var publishedAt : String,
        var author : String,
        var urlToImage : String,
        var title : String,
        var source : Source,
        var description : String,
        var url : String
)