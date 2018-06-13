package co.kr.studynews.data.news.api

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("top-headlines")
    fun getCategoryHeadline(
            @Query("country") country : String,
            @Query("category") category : String,
            @Query("apiKey") apiKey : String) : Flowable<Response>

    @GET("top-headlines")
    fun getHeadline(
            @Query("country") country : String,
            @Query("apiKey") apiKey : String) : Flowable<Response>

    // https://newsapi.org/v2/top-headlines?country=kr&apiKey=a4ea1bef7b4b4de3a4a78624ed850512
    // https://newsapi.org/v2/top-headlines?country=kr&category=""&apiKey=a4ea1bef7b4b4de3a4a78624ed850512

    // category : business entertainment general health science sports technology

}