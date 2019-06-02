package com.serkancay.beautext.ui.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

open class BaseActivity : AppCompatActivity() {

    lateinit var context: Context

    lateinit var activity: BaseActivity

    open fun getLayoutId(): Int {
        return -1
    }

    fun bindEvents() {}

    open fun onCreated() {}

    open fun onResumed() {}

    open fun onPaused() {}

    open fun onDestroyed() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        activity = this

        if (getLayoutId() != -1) {
            setContentView(getLayoutId())
        }

        onCreated()
        bindEvents()
    }

    override fun onResume() {
        super.onResume()
        onResumed()
    }

    override fun onPause() {
        super.onPause()
        onPaused()
    }

    override fun onDestroy() {
        super.onDestroy()
        onDestroyed()
    }

    fun replaceFragment(view: View, fragment: Fragment, addToBackStack: Boolean) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(view.id, fragment, fragment.javaClass.name)
        if (addToBackStack) {
            ft.addToBackStack(fragment.javaClass.name)
        }
        ft.commit()
    }

    fun removeFragment(fragment: Fragment, addToBackStack: Boolean) {
        val ft = supportFragmentManager.beginTransaction()
        ft.remove(fragment)
        if (addToBackStack) {
            ft.addToBackStack(fragment.javaClass.name)
        }
        ft.commit()
    }

    fun clearBackStack() {
        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }
}