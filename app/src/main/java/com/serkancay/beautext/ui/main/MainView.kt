package com.serkancay.beautext.ui.main

import com.serkancay.beautext.ui.base.BaseFragment

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

interface MainView {

    fun setFragment(fragment: BaseFragment, addToBackStack: Boolean)
}