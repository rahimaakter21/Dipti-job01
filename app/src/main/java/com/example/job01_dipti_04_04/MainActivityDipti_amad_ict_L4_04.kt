package com.example.job01_dipti_04_04

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivityDipti_amad_ict_L4_04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_dipti_amad_ict_l4_04)
        Handler( Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ProductActivitityDipti_amad_ict_L4_04::class.java))
        },3000)
    }
}