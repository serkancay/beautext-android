package com.serkancay.beautext.widget

import android.annotation.SuppressLint
import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.serkancay.beautext.R
import kotlinx.android.synthetic.main.widget_step_footer.view.ivStep1
import kotlinx.android.synthetic.main.widget_step_footer.view.ivStep2
import kotlinx.android.synthetic.main.widget_step_footer.view.ivStep3
import kotlinx.android.synthetic.main.widget_step_footer.view.llStep1
import kotlinx.android.synthetic.main.widget_step_footer.view.llStep2
import kotlinx.android.synthetic.main.widget_step_footer.view.llStep3
import kotlinx.android.synthetic.main.widget_step_footer.view.tvStep1
import kotlinx.android.synthetic.main.widget_step_footer.view.tvStep2
import kotlinx.android.synthetic.main.widget_step_footer.view.tvStep3

/**
 *
 * Created by S.Serkan Cay on 2.06.2019
 *
 */

class BottomNavigationBar : LinearLayout {

    val STEP_1 = 0
    val STEP_2 = 1
    val STEP_3 = 2

    private var mActiveStep = 0

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    @SuppressLint("NewApi")
    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    ) {
        init(context)
    }

    fun init(context: Context) {
        val layoutInflater = LayoutInflater.from(context)
        layoutInflater.inflate(R.layout.widget_step_footer, this)
    }

    fun next() {
        mActiveStep++
        if (mActiveStep > STEP_3) {
            return
        }
        if (mActiveStep == STEP_1) {
            setStep1Active()
        } else if (mActiveStep == STEP_2) {
            setStep2Active()
        } else if (mActiveStep == STEP_3) {
            setStep3Active()
        }
    }

    fun prev() {
        mActiveStep--
        if (mActiveStep < STEP_1) {
            return
        }
        if (mActiveStep == STEP_1) {
            setStep1Active()
        } else if (mActiveStep == STEP_2) {
            setStep2Active()
        } else if (mActiveStep == STEP_3) {
            setStep3Active()
        }
    }

    fun getActiveStep(): Int {
        return mActiveStep
    }

    private fun setStep1Active() {
        llStep1.setBackgroundColor(resources.getColor(R.color.primary_text))
        ivStep1.setImageResource(R.drawable.ic_pen_red)
        tvStep1.setTextColor(resources.getColor(R.color.colorPrimary))
        llStep2.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep2.setImageResource(R.drawable.ic_style_white)
        tvStep2.setTextColor(resources.getColor(R.color.primary_text))
        llStep3.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep3.setImageResource(R.drawable.ic_effect_red)
        tvStep3.setTextColor(resources.getColor(R.color.primary_text))
    }

    private fun setStep2Active() {
        llStep1.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep1.setImageResource(R.drawable.ic_pen_white)
        tvStep1.setTextColor(resources.getColor(R.color.primary_text))
        llStep2.setBackgroundColor(resources.getColor(R.color.primary_text))
        ivStep2.setImageResource(R.drawable.ic_style_red)
        tvStep2.setTextColor(resources.getColor(R.color.colorPrimary))
        llStep3.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep3.setImageResource(R.drawable.ic_effect_white)
        tvStep3.setTextColor(resources.getColor(R.color.primary_text))
    }

    private fun setStep3Active() {
        llStep1.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep1.setImageResource(R.drawable.ic_pen_white)
        tvStep1.setTextColor(resources.getColor(R.color.primary_text))
        llStep2.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        ivStep2.setImageResource(R.drawable.ic_style_white)
        tvStep2.setTextColor(resources.getColor(R.color.primary_text))
        llStep3.setBackgroundColor(resources.getColor(R.color.primary_text))
        ivStep3.setImageResource(R.drawable.ic_effect_red)
        tvStep3.setTextColor(resources.getColor(R.color.colorPrimary))
    }
}