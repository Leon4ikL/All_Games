package com.leon.allgamesagru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leon.allgamesagru.databinding.ActivityMainBinding
import com.leon.allgamesagru.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(binding.fragmentContainer.id,HomeFragment())
                .commit()
        }
    }
}