package com.example.job01_dipti_04_04

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object apiIntance_dipti_amad_ict_l4_04 {
    val retrofit = Retrofit.Builder()

        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(apiService_Dipti_amad_ict_l4_04::class.java)

}

