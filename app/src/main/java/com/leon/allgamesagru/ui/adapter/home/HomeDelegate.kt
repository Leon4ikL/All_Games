package com.leon.allgamesagru.ui.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.leon.allgamesagru.R
import com.leon.allgamesagru.databinding.*
import com.leon.allgamesagru.ui.models.*

object HomeDelegate {

    fun homeHorizontalListDelegate() =
        adapterDelegateViewBinding<HorizontalList, ListItem, ItemHomeHorizontalListBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeHorizontalListBinding
                    .inflate(layoutInflater, parent, false)
            }
        ) {
            val adapter = CardAdapter()
            binding.recyclerView.adapter = adapter
            bind {
                adapter.items = item.items
            }
        }


    fun homeHorizontalListWithTitleDelegate() =
        adapterDelegateViewBinding<HorizontalListWithTitle, ListItem, ItemHomeHorizontalListWithTitleBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeHorizontalListWithTitleBinding
                    .inflate(layoutInflater, parent, false)
            }
        ) {
            val adapter = CardAdapter()
            binding.recyclerView.adapter = adapter
            bind {
                binding.tvCategoryTitle.text = item.title
                adapter.items = item.items
            }
        }


    fun catalogItemDelegate() =
        adapterDelegateViewBinding<CatalogItem, ListItem, ItemCatalogBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemCatalogBinding
                    .inflate(layoutInflater, parent, false)
            }
        ) {
            bind {
                binding.tvTitle.text = item.title
            }
        }

    fun gameWideItemDelegate() =
        adapterDelegateViewBinding<GameWideItem, ListItem, ItemGameWideBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemGameWideBinding
                    .inflate(layoutInflater, parent, false)
            }
        ){
            bind {
                binding.tvTitle.text = item.title
            }
        }

    fun gameThinItemDelegate() =
        adapterDelegateViewBinding<GameThinItem, ListItem, ItemGameThinBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemGameThinBinding
                    .inflate(layoutInflater, parent, false)
            }
        ){
            bind {
                binding.tvTitle.text = item.title
            }
        }

}