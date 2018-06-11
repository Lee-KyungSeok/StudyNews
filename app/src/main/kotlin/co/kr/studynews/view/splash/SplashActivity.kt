package co.kr.studynews.view.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.kr.studynews.R
import co.kr.studynews.view.news.NewsActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    private fun end() {
        finish()
    }
}
