package com.leon.allgamesagru.ui.models

data class CategoriesSmallItem(
    val id: Int,
    val title: String,
    val games: List<SmallGameItem>
): HomeVerticalListItems
