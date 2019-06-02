package com.serkancay.beautext.ui.main

import android.content.Context
import android.content.Intent
import com.serkancay.beautext.R.layout
import com.serkancay.beautext.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    override fun getLayoutId(): Int {
        return layout.activity_main
    }

    override fun onCreated() {
    }
}
