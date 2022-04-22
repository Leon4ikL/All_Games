package com.leon.allgamesagru.ui.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.leon.allgamesagru.R
import com.leon.allgamesagru.databinding.ItemCatalogBinding
import com.leon.allgamesagru.databinding.ItemGameSmallBinding
import com.leon.allgamesagru.databinding.ItemGameThinBinding
import com.leon.allgamesagru.ui.models.CatalogItem
import com.leon.allgamesagru.ui.models.HomeHorizontalListItem
import com.leon.allgamesagru.ui.models.SmallGameItem
import com.leon.allgamesagru.ui.models.ThinGameItem

object HomeHorizontalDelegate {


    fun smallGameListAdapterDelegate() = adapterDelegateViewBinding<SmallGameItem, HomeHorizontalListItem, ItemGameSmallBinding >({
            layoutInflater: LayoutInflater, parent: ViewGroup ->  ItemGameSmallBinding.inflate(layoutInflater, parent, false)
    }){
        bind {
            binding.tvTitle.text = item.id.toString()
            binding.ivGame.setImageResource(R.drawable._4b1f1850a1c06fd971bc6ab3ac0ce0e)
        }
    }

    fun thinGameListAdapterDelegate() = adapterDelegateViewBinding<ThinGameItem, HomeHorizontalListItem, ItemGameThinBinding >({
            layoutInflater: LayoutInflater, parent: ViewGroup ->  ItemGameThinBinding.inflate(layoutInflater, parent, false)
    }){
        bind {
            binding.tvTitle.text = item.id.toString()
            binding.ivGame.setImageResource(R.drawable._4b1f1850a1c06fd971bc6ab3ac0ce0e)
        }
    }

    fun catalogListAdapterDelegate() = adapterDelegateViewBinding<CatalogItem, HomeHorizontalListItem, ItemCatalogBinding >({
            layoutInflater: LayoutInflater, parent: ViewGroup ->  ItemCatalogBinding.inflate(layoutInflater, parent, false)
    }){
        bind {
            binding.tvTitle.text = item.id.toString()
        }
    }
}