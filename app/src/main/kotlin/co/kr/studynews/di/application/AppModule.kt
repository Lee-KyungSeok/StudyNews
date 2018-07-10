package co.kr.studynews.di.application

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Named("appContext")
    @Singleton
    fun providesContext(application: Application) : Context = application.applicationContext
}