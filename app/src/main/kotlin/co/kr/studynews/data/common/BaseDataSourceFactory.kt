package co.kr.studynews.data.common

interface BaseDataSourceFactory {
    fun create(dataSourceType: DataSourceType) : BaseDataSource
}