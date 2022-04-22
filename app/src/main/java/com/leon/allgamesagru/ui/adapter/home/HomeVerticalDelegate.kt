package com.leon.allgamesagru.ui.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.leon.allgamesagru.databinding.ItemHomeVerticalCatalogBinding
import com.leon.allgamesagru.databinding.ItemHomeVerticalCategoriesBinding
import com.leon.allgamesagru.ui.models.CatalogListItem
import com.leon.allgamesagru.ui.models.CategoriesSmallItem
import com.leon.allgamesagru.ui.models.CategoriesThinItem
import com.leon.allgamesagru.ui.models.HomeVerticalListItems

object HomeVerticalDelegate {

    private val adapterCategoriesSmallGamesList = ListDelegationAdapter(
        HomeHorizontalDelegate.smallGameListAdapterDelegate()
    )

    private val adapterCategoriesThinGamesList = ListDelegationAdapter(
        HomeHorizontalDelegate.thinGameListAdapterDelegate()
    )

    private val adapterCatalogList = ListDelegationAdapter(
        HomeHorizontalDelegate.catalogListAdapterDelegate()
    )

    fun categoriesGameListAdapterDelegate() =
        adapterDelegateViewBinding<CategoriesSmallItem, HomeVerticalListItems, ItemHomeVerticalCategoriesBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeVerticalCategoriesBinding.inflate(layoutInflater, parent, false)
            })
        {
            bind {
                binding.tvCategoryTitle.text = item.title
                binding.recyclerView.adapter = adapterCategoriesSmallGamesList
                adapterCategoriesSmallGamesList.items = item.games
            }
        }

    fun categoriesThinGameListAdapterDelegate() =
        adapterDelegateViewBinding<CategoriesThinItem, HomeVerticalListItems, ItemHomeVerticalCategoriesBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeVerticalCategoriesBinding.inflate(layoutInflater, parent, false)
            })
        {
            bind {
                binding.tvCategoryTitle.text = item.title
                binding.recyclerView.adapter = adapterCategoriesThinGamesList
                adapterCategoriesThinGamesList.items = item.games
            }
        }

    fun catalogListAdapterDelegate() =
        adapterDelegateViewBinding<CatalogListItem, HomeVerticalListItems, ItemHomeVerticalCatalogBinding>(
            { layoutInflater: LayoutInflater, parent: ViewGroup ->
                ItemHomeVerticalCatalogBinding.inflate(layoutInflater, parent, false)
            }) {
            bind {
                binding.recyclerView.adapter = adapterCatalogList
                adapterCatalogList.items = item.catalog
            }
        }



}