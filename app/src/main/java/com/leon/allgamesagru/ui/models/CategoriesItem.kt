package com.leon.allgamesagru.ui.models

data class CategoriesItem(
    val id: Int,
    val title: String,
    val games: List<HomeHorizontalListItem>
): HomeVerticalListItems
