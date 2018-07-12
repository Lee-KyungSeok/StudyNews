package co.kr.studynews.di

import co.kr.studynews.BuildConfig
import co.kr.studynews.data.remote.api.NewsApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideNewsApi(
            okHttpClient: OkHttpClient,
            callAdapter: CallAdapter.Factory,
            converter: Converter.Factory) : NewsApi
    = Retrofit.Builder()
            .baseUrl(BuildConfig.NEWS_URL)
            .client(okHttpClient)
            .addCallAdapterFactory(callAdapter)
            .addConverterFactory(converter)
            .build()
            .create(NewsApi::class.java)

    @Provides
    @Singleton
    fun provideCallAdapterFactory() : CallAdapter.Factory = RxJava2CallAdapterFactory.createAsync()

    @Provides
    @Singleton
    fun provideConverterFactory() : Converter.Factory = GsonConverterFactory.create()
}