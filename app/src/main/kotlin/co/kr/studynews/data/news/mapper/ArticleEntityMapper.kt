package co.kr.studynews.data.news.mapper

import co.kr.studynews.data.common.BaseEntityMapper
import co.kr.studynews.data.news.model.ArticleNetworkModel
import co.kr.studynews.entity.news.Article

class ArticleEntityMapper : BaseEntityMapper<ArticleNetworkModel, Article> {
    override fun toEntity(dataModel: ArticleNetworkModel): Article {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fromEntity(entity: Article): ArticleNetworkModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}