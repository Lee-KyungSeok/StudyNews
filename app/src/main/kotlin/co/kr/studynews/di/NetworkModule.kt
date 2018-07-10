package co.kr.studynews.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun  provideOkHttpClient(interceptor: HttpLoggingInterceptor) : OkHttpClient
    = OkHttpClient.Builder().addInterceptor(interceptor).build()

    @Provides
    @Singleton
    fun provideLoggingInterceptor() : HttpLoggingInterceptor
    = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
}