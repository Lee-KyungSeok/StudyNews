package co.kr.studynews.data.news.model

data class Response (
        var status : String,
        var totalResults : Int?,
        var articles : List<ArticleNetworkModel>,
        var code : String?,
        var message : String?
)