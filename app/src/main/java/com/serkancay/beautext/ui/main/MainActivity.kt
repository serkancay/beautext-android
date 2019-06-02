package com.serkancay.beautext.ui.main

import android.content.Context
import android.content.Intent
import com.serkancay.beautext.R.layout
import com.serkancay.beautext.ui.base.BaseActivity
import com.serkancay.beautext.ui.base.BaseFragment
import com.serkancay.beautext.ui.text.TextFragment
import kotlinx.android.synthetic.main.activity_main.flContent

class MainActivity : BaseActivity(), MainView {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    private lateinit var frText: TextFragment

    private lateinit var mPresenter: MainPresenter

    override fun getLayoutId(): Int {
        return layout.activity_main
    }

    override fun onCreated() {
        frText = TextFragment()
        mPresenter = MainPresenter(this)
        mPresenter.addFragment(frText, false)
    }

    override fun setFragment(fragment: BaseFragment, addToBackStack: Boolean) {
        fragment.attachPresenter(mPresenter)
        replaceFragment(flContent, fragment, addToBackStack)
    }
}
