package com.sriyank.frameanimation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()
    }
    fun showBatteryActivity(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun showWifiActivity(view: View){
        val intent = Intent(this, WifiActivity::class.java)
        startActivity(intent)
    }
}