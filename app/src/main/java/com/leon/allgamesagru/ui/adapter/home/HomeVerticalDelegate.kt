package com.leon.allgamesagru.ui.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.leon.allgamesagru.databinding.ItemHomeVerticalCatalogBinding
import com.leon.allgamesagru.databinding.ItemHomeVerticalCategoriesBinding
import com.leon.allgamesagru.ui.models.CatalogListItem
import com.leon.allgamesagru.ui.models.CategoriesItem
import com.leon.allgamesagru.ui.models.HomeVerticalListItems

object HomeVerticalDelegate {

    private val adapterCategoriesGamesList = ListDelegationAdapter(
        HomeHorizontalDelegate.smallGameListAdapterDelegate(),
        HomeHorizontalDelegate.thinGameListAdapterDelegate()
    )




    fun categoriesGameListAdapterDelegate() =
        adapterDelegateViewBinding<CategoriesItem, HomeVerticalListItems, ItemHomeVerticalCategoriesBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeVerticalCategoriesBinding.inflate(layoutInflater, parent, false)
            })
        {
            bind {
                binding.tvCategoryTitle.text = item.title
                binding.recyclerView.adapter = adapterCategoriesGamesList
                adapterCategoriesGamesList.items = item.games
            }
        }

    fun catalogListAdapterDelegate() =
        adapterDelegateViewBinding<CatalogListItem, HomeVerticalListItems, ItemHomeVerticalCatalogBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeVerticalCatalogBinding.inflate(layoutInflater, parent, false)
            }) {
            bind {

            }
        }



}