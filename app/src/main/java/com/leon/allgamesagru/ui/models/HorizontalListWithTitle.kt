package com.leon.allgamesagru.ui.models

data class HorizontalListWithTitle(
    val title: String,
    val items: List<ListItem>
): ListItem{
    override val id: Int = title.hashCode()
}
