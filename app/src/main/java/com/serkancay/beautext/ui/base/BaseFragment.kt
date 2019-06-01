package com.serkancay.beautext.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

class BaseFragment : Fragment() {

    lateinit var activity: BaseActivity

    private lateinit var vgContainer: ViewGroup

    fun getLayoutId(): Int {
        return -1
    }

    fun onCreated() {}

    fun onResumed() {}

    fun onPaused() {}

    fun onDestroyed() {}

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
}