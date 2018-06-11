package co.kr.studynews.view.news

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.kr.studynews.R
import co.kr.studynews.view.splash.SplashActivity

class NewsActivity : AppCompatActivity() {

    private lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(NewsViewModel::class.java)


        val intent = Intent(this, SplashActivity::class.java)
        startActivity(intent)
        setTheme(R.style.AppTheme)

    }
}
