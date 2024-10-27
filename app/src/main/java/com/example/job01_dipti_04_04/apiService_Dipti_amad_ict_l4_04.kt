package com.example.job01_dipti_04_04

import retrofit2.http.GET

interface apiService_Dipti_amad_ict_l4_04 {
    @GET("products")
    suspend fun  getProducts(): List<ProductDipti_amad_ict_l4_04>
}