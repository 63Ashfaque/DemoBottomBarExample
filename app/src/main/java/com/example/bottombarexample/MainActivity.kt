package com.example.bottombarexample


import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.databinding.DataBindingUtil
import com.example.bottombarexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private val scaleDuration:Long=250

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        initialize()
        initialize1()
    }

    private fun initialize() {

        mBinding.fab.setOnClickListener {
            mBinding.fab.animate().rotationBy(180f).setDuration(100)
                .setInterpolator(LinearInterpolator())
                .start()
        }

        mBinding.menuHome.setOnClickListener {
            clickAction(mBinding.imgHome,mBinding.tvHome)
        }

        mBinding.menuTransaction.setOnClickListener {
            clickAction(mBinding.imgTransaction,mBinding.tvTransaction)
        }

        mBinding.menuNotification.setOnClickListener {
            clickAction(mBinding.imgNotification,mBinding.tvNotification)
        }

        mBinding.menuSetting.setOnClickListener {
            clickAction(mBinding.imgSetting,mBinding.tvSetting)
        }

    }
    private fun clickAction(imageView: ImageView, textView: TextView) {
        defaultSize()
        imageView.animate().scaleX(1.5f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        imageView.animate().scaleY(1.5f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()

        textView.animate().scaleX(1.2f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        textView.animate().scaleY(1.2f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
    }
    private fun defaultSize() {
        callDefault(mBinding.imgHome,mBinding.tvHome)
        callDefault(mBinding.imgTransaction, mBinding.tvTransaction)
        callDefault(mBinding.imgNotification, mBinding.tvNotification)
        callDefault(mBinding.imgSetting, mBinding.tvSetting)
    }
    private fun callDefault(imageView: ImageView, textView: TextView) {
        imageView.animate().scaleX(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        imageView.animate().scaleY(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()

        textView.animate().scaleX(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        textView.animate().scaleY(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
    }

    private fun initialize1() {

        mBinding.fab1.setOnClickListener {
            mBinding.fab1.animate().rotationBy(180f).setDuration(100)
                .setInterpolator(LinearInterpolator())
                .start()
        }

        mBinding.menuHome1.setOnClickListener {
            clickAction1(mBinding.imgHome1,mBinding.tvHome1)
        }

        mBinding.menuTransaction1.setOnClickListener {
            clickAction1(mBinding.imgTransaction1,mBinding.tvTransaction1)
        }

        mBinding.menuNotification1.setOnClickListener {
            clickAction1(mBinding.imgNotification1,mBinding.tvNotification1)
        }

        mBinding.menuSetting1.setOnClickListener {
            clickAction1(mBinding.imgSetting1,mBinding.tvSetting1)
        }

    }

    private fun clickAction1(imageView: ImageView, textView: TextView) {
        defaultSize1()
        imageView.animate().scaleX(1.5f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        imageView.animate().scaleY(1.5f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        textView.visibility= View.VISIBLE
        textView.animate().translationX(1.5f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
    }
    private fun defaultSize1() {
        callDefault1(mBinding.imgHome1,mBinding.tvHome1)
        callDefault1(mBinding.imgTransaction1, mBinding.tvTransaction1)
        callDefault1(mBinding.imgNotification1, mBinding.tvNotification1)
        callDefault1(mBinding.imgSetting1, mBinding.tvSetting1)
    }
    private fun callDefault1(imageView: ImageView, textView: TextView) {
        imageView.animate().scaleX(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()
        imageView.animate().scaleY(1f).setDuration(scaleDuration).interpolator =
            LinearInterpolator()

        textView.visibility= View.INVISIBLE
    }

}











