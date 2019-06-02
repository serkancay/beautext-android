package com.serkancay.beautext.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.serkancay.beautext.ui.base.FragmentNavigation.Presenter

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

open class BaseFragment : Fragment(), FragmentNavigation.View {

    lateinit var activity: BaseActivity

    protected lateinit var mNavigationPresenter: FragmentNavigation.Presenter

    private lateinit var vgContainer: ViewGroup

    open fun getLayoutId(): Int {
        return -1
    }

    open fun onCreated() {}

    open fun onResumed() {}

    open fun onPaused() {}

    open fun onDestroyed() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity = getActivity() as BaseActivity
        if (getLayoutId() != -1) {
            vgContainer = inflater.inflate(getLayoutId(), null) as ViewGroup
        }
        onCreated()
        return vgContainer
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

    override fun attachPresenter(presenter: Presenter) {
        mNavigationPresenter = presenter
    }
}