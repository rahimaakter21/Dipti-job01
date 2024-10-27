package com.example.job01_dipti_04_04.viewmodel_dipti_amad_ict_l4_04

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.example.job01_dipti_04_04.ProductDipti_amad_ict_l4_04
import com.example.job01_dipti_04_04.apiIntance_dipti_amad_ict_l4_04
import kotlinx.coroutines.launch

class ProductViewModelDiptiL404: ViewModel() {
    private val _products = MutableLiveData<List<ProductDipti_amad_ict_l4_04>>()
    val products: LiveData<List<ProductDipti_amad_ict_l4_04>> = _products
    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private  suspend fun fetchProducts() {
        try {
            val response = apiIntance_dipti_amad_ict_l4_04.apiService.getProducts()
            _products.postValue(response)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}