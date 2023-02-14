package com.example.ciclodevidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ciclodevidaactivity.databinding.ActivityMainBBinding

class MainActivityB : AppCompatActivity() {

    private lateinit var binding: ActivityMainBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}