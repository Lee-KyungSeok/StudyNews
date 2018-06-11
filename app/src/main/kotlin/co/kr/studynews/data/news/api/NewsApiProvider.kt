package co.kr.studynews.data.news.api

import co.kr.studynews.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.internal.http.BridgeInterceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsApiProvider {

    fun provideNewsApi(): NewsApi {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.NEWS_URL)
                .client(provideOkHttpClient(provideLoggingInterceptor()))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NewsApi::class.java)
    }

    private fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
    }

    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }
}