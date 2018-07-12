package co.kr.studynews.data.local.model


import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class ArticleRealmModel: RealmObject() {
    @PrimaryKey lateinit var id: String
    open lateinit var publishedAt : String
    open lateinit var author : String
    open lateinit var urlToImage : String
    open lateinit var title : String
    open lateinit var description : String
    open lateinit var url : String
}