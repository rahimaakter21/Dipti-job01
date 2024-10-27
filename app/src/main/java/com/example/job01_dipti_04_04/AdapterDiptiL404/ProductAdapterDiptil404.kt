package com.example.job01_dipti_04_04.AdapterDiptiL404

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.job01_dipti_04_04.ProductDiptil404
import com.example.job01_dipti_04_04.R

class ProductAdapterDiptil404 (private val products: List<ProductDiptil404>): RecyclerView.Adapter<ProductAdapterDiptil404.ProductViewHolder>() {

    inner class  ProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val productImg = itemView.findViewById<ImageView>(R.id.images)
        val productTitle = itemView.findViewById<TextView>(R.id.title)
        val productName= itemView.findViewById<TextView>(R.id.nameTV)
        val productPrice= itemView.findViewById<TextView>(R.id.priceTV)
        val productDescription= itemView.findViewById<TextView>(R.id.descriptionTV)

        fun bind(product: ProductDiptil404){

            productTitle.text = product.title
            productName.text = product.name
            productPrice.text = "Price : ${product.price}$"
            productDescription.text = product.description
            Glide.with(itemView).load(product.images[0]).into(productImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_listdiptil404,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }
}
