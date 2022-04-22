package com.leon.allgamesagru.ui.models

data class CategoriesThinItem(
    val id: Int,
    val title: String,
    val games: List<ThinGameItem>
): HomeVerticalListItems
