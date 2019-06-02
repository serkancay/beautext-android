package com.serkancay.beautext.ui.base

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

interface FragmentNavigation {

    interface View {
        fun attachPresenter(presenter: Presenter)
    }

    interface Presenter {
        fun addFragment(fragment: BaseFragment, addToBackStack: Boolean)
    }
}