package co.kr.studynews.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.kr.studynews.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    private fun end() {
        finish()
    }
}
