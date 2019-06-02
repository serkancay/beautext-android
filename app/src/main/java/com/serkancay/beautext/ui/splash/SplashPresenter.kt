package com.serkancay.beautext.ui.splash

import android.os.Handler

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

class SplashPresenter {

    private val SPLASH_DELAY_TIME = 2000L

    private var mView : SplashView?

    constructor(view : SplashView) {
        mView = view
    }

    fun onResume() {
        finishWithDelay()
    }

    fun onDestroy() {
        mView = null
    }

    fun finishWithDelay() {
        Handler().postDelayed({
           mView?.navigateToHome()
        }, SPLASH_DELAY_TIME)
    }
}