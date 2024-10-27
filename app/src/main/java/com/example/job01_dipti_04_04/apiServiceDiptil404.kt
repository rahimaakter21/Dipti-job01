package com.example.job01_dipti_04_04

import retrofit2.http.GET

interface apiServiceDiptil404 {
    @GET("products")
    suspend fun  getProducts(): List<ProductDiptil404>
}