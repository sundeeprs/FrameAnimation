package com.sriyank.frameanimation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wifi.*

class WifiAnimation: AppCompatActivity(){

    private lateinit var frameAnimation2: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi)
    }

    override fun onStart() {
        super.onStart()

            imageView2.setBackgroundResource(R.drawable.wifi_animation_list)
            frameAnimation2 = imageView2.background as AnimationDrawable
            frameAnimation2.start()

    }

    fun onStartStopWiFiAnimation(view: View){
        if(frameAnimation2.isRunning)
            frameAnimation2.stop()
        else
            frameAnimation2.start()
    }
}