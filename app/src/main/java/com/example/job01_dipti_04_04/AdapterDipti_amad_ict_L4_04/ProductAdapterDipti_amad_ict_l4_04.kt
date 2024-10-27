package com.example.job01_dipti_04_04.AdapterDipti_amad_ict_L4_04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.job01_dipti_04_04.ProductDipti_amad_ict_l4_04
import com.example.job01_dipti_04_04.R

class ProductAdapterDipti_amad_ict_l4_04 (private val products: List<ProductDipti_amad_ict_l4_04>): RecyclerView.Adapter<ProductAdapterDipti_amad_ict_l4_04.ProductViewHolder>() {

    inner class  ProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val productImg = itemView.findViewById<ImageView>(R.id.images)
        val productTitle = itemView.findViewById<TextView>(R.id.title)
        val productName= itemView.findViewById<TextView>(R.id.nameTV)
        val productPrice= itemView.findViewById<TextView>(R.id.priceTV)
        val productDescription= itemView.findViewById<TextView>(R.id.descriptionTV)

        fun bind(product: ProductDipti_amad_ict_l4_04){

            productTitle.text = product.title
            productName.text = product.name
            productPrice.text = "Price : ${product.price}$"
            productDescription.text = product.description
            Glide.with(itemView).load(product.images[0]).into(productImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_dipti_amad_ict_l4_04,parent,false)
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
