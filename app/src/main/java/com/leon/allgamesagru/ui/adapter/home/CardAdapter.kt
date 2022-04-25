package com.leon.allgamesagru.ui.adapter.home

import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import com.leon.allgamesagru.ui.models.ListItem
import com.leon.allgamesagru.utils.BaseDiffUtilItemCallback

class CardAdapter: AsyncListDifferDelegationAdapter<ListItem>(BaseDiffUtilItemCallback()) {
    init {
        delegatesManager
            .addDelegate(HomeDelegate.catalogItemDelegate())
            .addDelegate(HomeDelegate.gameThinItemDelegate())
            .addDelegate(HomeDelegate.gameWideItemDelegate())
    }
}