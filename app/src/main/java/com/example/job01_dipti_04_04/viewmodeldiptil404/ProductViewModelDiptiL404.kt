package com.example.job01_dipti_04_04.viewmodeldiptil404

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.example.job01_dipti_04_04.ProductDiptil404
import com.example.job01_dipti_04_04.apiIntancediptil404
import kotlinx.coroutines.launch

class ProductViewModelDiptiL404: ViewModel() {
    private val _products = MutableLiveData<List<ProductDiptil404>>()
    val products: LiveData<List<ProductDiptil404>> = _products
    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private  suspend fun fetchProducts() {
        try {
            val response = apiIntancediptil404.apiService.getProducts()
            _products.postValue(response)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}