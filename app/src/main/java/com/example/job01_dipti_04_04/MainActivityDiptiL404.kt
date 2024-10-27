package com.example.job01_dipti_04_04

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivityDiptiL404 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_dipti_l404)
        Handler( Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ProductActivitityDiptiL404::class.java))
        },3000)
    }
}