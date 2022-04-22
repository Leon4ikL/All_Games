package com.leon.allgamesagru.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.leon.allgamesagru.databinding.FragmentHomeBinding
import com.leon.allgamesagru.ui.adapter.home.HomeVerticalDelegate
import com.leon.allgamesagru.ui.models.CatalogListItem
import com.leon.allgamesagru.ui.models.CategoriesItem
import com.leon.allgamesagru.ui.models.SmallGameItem
import com.leon.allgamesagru.ui.models.ThinGameItem

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding ?: throw RuntimeException("Home Fragment Binding == null")


    //private val verticalHomeScreenAdapter = VerticalHomeScreenAdapter()

    private val adapter = ListDelegationAdapter(
        HomeVerticalDelegate.categoriesGameListAdapterDelegate(),
        HomeVerticalDelegate.catalogListAdapterDelegate()
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
    }

    private fun initialization() {

        with(binding) {
//            verticalHomeScreenAdapter.list = listOf(
//                CategoryGameList(0,"Popularity", listOf(
//                    GameItem(0,1,"Game 1 Game Vampitr Vampire: The Masquerade - Bloodlines 2"),
//                    GameItem(0,1,"Game 2"),
//                    GameItem(0,1,"Game 3")
//                )),
//                CategoryGameList(1,"Category 1", listOf(
//                    GameItem(0,1,"Game 1"),
//                    GameItem(0,1,"Game 2"),
//                    GameItem(0,1,"Game 3")
//                )),
//                CategoryGameList(2,"Category 2", listOf(
//                    GameItem(0,1,"Game 1"),
//                    GameItem(0,1,"Game 2"),
//                    GameItem(0,1,"Game 3")
//                ))
//            )

            rvVertical.adapter = adapter
            adapter.apply {
                items = listOf(
                    CategoriesItem(
                        0, "Popularity", listOf(
                            SmallGameItem(1),
                            SmallGameItem(2),
                            SmallGameItem(3),
                            SmallGameItem(4),
                            SmallGameItem(5),
                            SmallGameItem(6),
                        )
                    ),
                    CategoriesItem(
                        0, "Popularity", listOf(
                            SmallGameItem(1),
                            SmallGameItem(2),
                            SmallGameItem(3),
                            SmallGameItem(4),
                            SmallGameItem(5),
                            SmallGameItem(6),
                        )
                    ),
                    CatalogListItem(
                        0, emptyList()
                    ),
                    CategoriesItem(
                        0, "Popularity", listOf(
                            ThinGameItem(0),
                            ThinGameItem(0),
                            ThinGameItem(0),
                            ThinGameItem(0),
                            ThinGameItem(0),
                        )
                    )
                )
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}