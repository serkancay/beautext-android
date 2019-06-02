package com.serkancay.beautext.ui.splash

import com.serkancay.beautext.ui.main.MainActivity
import com.serkancay.beautext.ui.base.BaseActivity

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

class SplashActivity : BaseActivity(), SplashView {

    private lateinit var mPresenter: SplashPresenter

    override fun onCreated() {
        mPresenter = SplashPresenter(this)
    }

    override fun onResumed() {
        mPresenter.onResume()
    }

    override fun onDestroyed() {
        mPresenter.onDestroy()
    }

    override fun navigateToHome() {
        MainActivity.start(context)
        finish()
    }
}