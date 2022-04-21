package com.leon.allgamesagru.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leon.allgamesagru.R
import com.leon.allgamesagru.databinding.ItemGameSmallBinding
import com.leon.allgamesagru.ui.models.GameItem

class HorizontalGameAdapter : RecyclerView.Adapter<HorizontalGameAdapter.GameViewHolder>() {

    var list: List<GameItem> = listOf()

    class GameViewHolder(val binding: ItemGameSmallBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val binding = ItemGameSmallBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return GameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        with(holder.binding){
            tvTitle.text = list[position].title
            ivGame.setImageResource(R.drawable._4b1f1850a1c06fd971bc6ab3ac0ce0e)
        }
    }

    override fun getItemCount(): Int = list.size
}