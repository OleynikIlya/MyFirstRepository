package com.example.mrprogram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mrprogram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationBar.setOnNavigationItemReselectedListener {
            when(it.itemId){

                R.id.firstFragment -> {
                    supportFragmentManager.beginTransaction().replace(binding.fragmentHolder.id, FirstFragment()).commit()
                }
                R.id.secondFragment -> {

                }
                R.id.thirdFragment -> {
                    // Daasdadk
                }
            }
        }

    }
}