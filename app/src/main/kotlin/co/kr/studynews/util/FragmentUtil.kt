package co.kr.studynews.util

import android.app.Activity
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.replaceContentFragment(@IdRes frameId: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction().replace(frameId, fragment).commit()
}

fun Activity.replaceContentFragment(@IdRes frameId: Int, fragment: android.app.Fragment) {
    fragmentManager.beginTransaction().replace(frameId, fragment).commit()
}

fun AppCompatActivity.addContentFragment(@IdRes frameId: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction().add(frameId, fragment).addToBackStack(null).commit()
}

fun Activity.addContentFragment(@IdRes frameId: Int, fragment: android.app.Fragment) {
    fragmentManager.beginTransaction().add(frameId, fragment).addToBackStack(null).commit()
}