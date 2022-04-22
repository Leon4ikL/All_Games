package com.leon.allgamesagru.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.leon.allgamesagru.databinding.FragmentHomeBinding
import com.leon.allgamesagru.ui.adapter.home.HomeVerticalDelegate
import com.leon.allgamesagru.ui.models.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding ?: throw RuntimeException("Home Fragment Binding == null")

    private val adapter = ListDelegationAdapter(
        HomeVerticalDelegate.categoriesGameListAdapterDelegate(),
        HomeVerticalDelegate.categoriesThinGameListAdapterDelegate(),
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
            rvVertical.adapter = adapter
            adapter.apply {
                items = listOf(
                    CatalogListItem(
                        0, listOf(
                            CatalogItem(1),
                            CatalogItem(2),
                            CatalogItem(3),
                            CatalogItem(4),
                        )
                    ),
                    CategoriesSmallItem(
                        0, "Popularity", listOf(
                            SmallGameItem(1),
                            SmallGameItem(2),
                            SmallGameItem(3),
                            SmallGameItem(4),
                            SmallGameItem(5),
                            SmallGameItem(6),
                        )
                    ),
                    CategoriesThinItem(
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