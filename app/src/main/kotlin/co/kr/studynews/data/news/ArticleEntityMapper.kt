package co.kr.studynews.data.news

import co.kr.studynews.data.BaseEntityMapper
import co.kr.studynews.data.news.api.ArticleNetworkModel
import co.kr.studynews.entity.news.Article

object ArticleEntityMapper : BaseEntityMapper<ArticleNetworkModel, Article> {
    override fun toEntity(dataModel: ArticleNetworkModel): Article {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fromEntity(entity: Article): ArticleNetworkModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}