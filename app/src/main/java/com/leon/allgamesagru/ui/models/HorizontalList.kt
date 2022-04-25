package com.leon.allgamesagru.ui.models

data class HorizontalList(
    val items: List<ListItem>
) : ListItem {
    override val id: Int = items.hashCode()
}
