package co.kr.studynews.data.remote.model

data class Response (
        var status : String?,
        var totalResults : Int?,
        var articles : List<ArticleNetworkModel>?
)