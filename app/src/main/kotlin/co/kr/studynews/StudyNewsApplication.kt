package co.kr.studynews

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.realm.Realm

class StudyNewsApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        Realm.init(this)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}