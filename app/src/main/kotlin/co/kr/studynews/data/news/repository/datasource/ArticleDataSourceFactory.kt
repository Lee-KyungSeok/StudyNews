package co.kr.studynews.data.news.repository.datasource

import android.content.Context
import co.kr.studynews.data.common.BaseDataSource
import co.kr.studynews.data.common.BaseDataSourceFactory
import co.kr.studynews.data.common.DataSourceType
import co.kr.studynews.data.news.mapper.ArticleEntityMapper

class ArticleDataSourceFactory(val context: Context) : BaseDataSourceFactory {

    override fun create(dataSourceType: DataSourceType): BaseDataSource {
        return when(dataSourceType) {
            DataSourceType.NEWS_API -> createArticleNetworkDataSource()
            DataSourceType.ROOM -> createArticleRoomDataSource()
        }
    }

    private fun createArticleNetworkDataSource() : ArticleDataSource {
        val articleEntityMapper = ArticleEntityMapper()
        return ArticleNetworkDataSource(articleEntityMapper)
    }

    private fun createArticleRoomDataSource() : ArticleDataSource {
        return ArticleRoomDataSource()
    }

}