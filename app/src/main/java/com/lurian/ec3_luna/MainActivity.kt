package com.lurian.ec3_luna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.lurian.ec3_luna.databinding.ActivityMainBinding
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val navhostFragment = supportFragmentManager.findFragmentById(R.id.fcv_note) as NavHostFragment
        val navController = navhostFragment.navController
        binding.bntmenu.setupWithNavController(navController)

    }



}
