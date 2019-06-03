package com.serkancay.beautext.ui.main

import com.serkancay.beautext.ui.base.BaseFragment
import com.serkancay.beautext.ui.base.FragmentNavigation.Presenter

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

class MainPresenter(view: MainView) : Presenter {

    private var mView: MainView = view

    override fun addFragment(fragment: BaseFragment, addToBackStack: Boolean) {
        mView.setFragment(fragment, addToBackStack)
    }

    fun onNextClicked() {
    }
}