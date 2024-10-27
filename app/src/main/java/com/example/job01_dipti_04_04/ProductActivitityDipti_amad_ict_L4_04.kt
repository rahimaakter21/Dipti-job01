package com.example.job01_dipti_04_04

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.job01_dipti_04_04.AdapterDipti_amad_ict_L4_04.ProductAdapterDipti_amad_ict_l4_04
import com.example.job01_dipti_04_04.viewmodel_dipti_amad_ict_l4_04.ProductViewModelDiptiL404
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivitityDipti_amad_ict_L4_04 : AppCompatActivity() {
    private  lateinit var  productViewModel: ProductViewModelDiptiL404
    private  lateinit var  productAdapter: ProductAdapterDipti_amad_ict_l4_04
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_product_activitity_dipti__amad_ict_l4_04)
        productViewModel = ViewModelProvider(this).get(ProductViewModelDiptiL404::class.java)

        productAdapter = ProductAdapterDipti_amad_ict_l4_04(emptyList())

        val  refreshBtn: FloatingActionButton = findViewById(R.id.refreshBtn)

        refreshBtn.setOnClickListener{

            startActivity(Intent(this@ProductActivitityDipti_amad_ict_L4_04,ProductActivitityDipti_amad_ict_L4_04::class.java))
            finish()
        }
        val recyclerView = findViewById<RecyclerView>(R.id.productRV)
        recyclerView.layoutManager= LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer {  products ->
            productAdapter = ProductAdapterDipti_amad_ict_l4_04(products)
            recyclerView.adapter = ProductAdapterDipti_amad_ict_l4_04(products)

        })
    }
}
