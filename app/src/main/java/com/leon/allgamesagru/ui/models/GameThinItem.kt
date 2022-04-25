package com.leon.allgamesagru.ui.models

data class GameThinItem(
    override val id: Int,
    val title: String,
    val image: Int
) : ListItem
