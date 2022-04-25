package com.leon.allgamesagru.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leon.allgamesagru.ui.models.*

class HomeFragmentViewModel: ViewModel() {

    private val _data = MutableLiveData<List<ListItem>>()
    val data: LiveData<List<ListItem>> = _data

    init {
        _data.value = getData()
    }

    private fun getData(): List<ListItem>{
        return listOf(
            HorizontalList(
                items = IntRange(0,5).map { CatalogItem(id = it, title = "TITLE", image = 0) }
            ),
            HorizontalListWithTitle(
                title = "Top rated",
                items = IntRange(0,10).map { GameWideItem(id = it, title = "TITLE $it", image = 0) }
            ),
            HorizontalListWithTitle(
                title = "Top rated",
                items = IntRange(0,2).map { GameThinItem(id = it, title = "TITLE $it", image = 0) }
            )
        )
    }

}