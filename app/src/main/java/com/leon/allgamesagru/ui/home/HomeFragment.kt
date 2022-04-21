package com.leon.allgamesagru.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leon.allgamesagru.R
import com.leon.allgamesagru.databinding.FragmentHomeBinding
import com.leon.allgamesagru.ui.adapter.HorizontalGameAdapter
import com.leon.allgamesagru.ui.adapter.VerticalHomeScreenAdapter
import com.leon.allgamesagru.ui.models.CategoryGameList
import com.leon.allgamesagru.ui.models.GameItem
import java.lang.RuntimeException

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding ?: throw RuntimeException("Home Fragment Binding == null")


    private val verticalHomeScreenAdapter = VerticalHomeScreenAdapter()

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
        with(binding){
            verticalHomeScreenAdapter.list = listOf(
                CategoryGameList(0,"Popularity", listOf(
                    GameItem(0,1,"Game 1"),
                    GameItem(0,1,"Game 2"),
                    GameItem(0,1,"Game 3")
                ))
            )
            rvVertical.adapter = verticalHomeScreenAdapter

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}