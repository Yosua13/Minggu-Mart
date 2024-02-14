package com.example.minggumart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minggumart.databinding.PopulerItemBinding

class PopulerAdaptor(private val items: List<String>, private val price: List<String>, private val image: List<Int>) : RecyclerView.Adapter<PopulerAdaptor.PopulerViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopulerAdaptor.PopulerViewHolder {
        return PopulerViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PopulerAdaptor.PopulerViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item, price, images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopulerViewHolder(private val binding: PopulerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val imagesView = binding.imagePopuler
        fun bind(item: String, price: String, images: Int) {
            binding.foodNamePopuler.text = item
            binding.pricePopular.text = price
            imagesView.setImageResource(images)
        }
    }
}