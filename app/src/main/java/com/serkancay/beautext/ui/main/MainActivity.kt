package com.serkancay.beautext.ui.main

import android.content.Context
import android.content.Intent
import com.serkancay.beautext.R.layout
import com.serkancay.beautext.ui.base.BaseActivity
import com.serkancay.beautext.ui.base.BaseFragment

class MainActivity : BaseActivity(), MainView {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    private lateinit var mPresenter: MainPresenter

    override fun getLayoutId(): Int {
        return layout.activity_main
    }

    override fun onCreated() {
        mPresenter = MainPresenter(this)
    }

    override fun setFragment(fragment: BaseFragment, addToBackStack: Boolean) {
    }
}
