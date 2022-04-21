package com.leon.allgamesagru.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.leon.allgamesagru.databinding.ItemHomeVerticalBinding
import com.leon.allgamesagru.ui.models.CategoryGameList

class VerticalHomeScreenAdapter :
    RecyclerView.Adapter<VerticalHomeScreenAdapter.VerticalViewHolder>() {

    var list = listOf<CategoryGameList>()
    private val horizontalGameAdapter = HorizontalGameAdapter()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val binding =
            ItemHomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VerticalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.binding.tvCategoryTitle.text = list[position].title
        horizontalGameAdapter.list = list[position].games
        holder.binding.recyclerView.adapter = horizontalGameAdapter
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VerticalViewHolder(val binding: ItemHomeVerticalBinding) :
        RecyclerView.ViewHolder(binding.root)
}