package com.serkancay.beautext.ui.main

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.View.OnClickListener
import com.serkancay.beautext.R.layout
import com.serkancay.beautext.ui.base.BaseActivity
import com.serkancay.beautext.ui.base.BaseFragment
import com.serkancay.beautext.ui.text.TextFragment
import kotlinx.android.synthetic.main.activity_main.flContent
import kotlinx.android.synthetic.main.toolbar_main.ibNext

class MainActivity : BaseActivity(), MainView, OnClickListener {

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

    override fun bindEvents() {
        ibNext.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (ibNext == v) {
            mPresenter.onNextClicked()
        }
    }

    override fun setFragment(fragment: BaseFragment, addToBackStack: Boolean) {
        fragment.attachPresenter(mPresenter)
        replaceFragment(flContent, fragment, addToBackStack)
    }

    override fun onNextClicked() {
    }
}
