package com.example.job01_dipti_04_04

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.job01_dipti_04_04.AdapterDiptiL404.ProductAdapterDiptil404
import com.example.job01_dipti_04_04.viewmodeldiptil404.ProductViewModelDiptiL404
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivitityDiptiL404 : AppCompatActivity() {
    private  lateinit var  productViewModel: ProductViewModelDiptiL404
    private  lateinit var  productAdapter: ProductAdapterDiptil404
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_product_activitity_dipti_l404)
        productViewModel = ViewModelProvider(this).get(ProductViewModelDiptiL404::class.java)

        productAdapter = ProductAdapterDiptil404(emptyList())

        val  refreshBtn: FloatingActionButton = findViewById(R.id.refreshBtn)

        refreshBtn.setOnClickListener{

            startActivity(Intent(this@ProductActivitityDiptiL404,ProductActivitityDiptiL404::class.java))
            finish()
        }
        val recyclerView = findViewById<RecyclerView>(R.id.productRV)
        recyclerView.layoutManager= LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer {  products ->
            productAdapter = ProductAdapterDiptil404(products)
            recyclerView.adapter = ProductAdapterDiptil404(products)

        })
    }
}
