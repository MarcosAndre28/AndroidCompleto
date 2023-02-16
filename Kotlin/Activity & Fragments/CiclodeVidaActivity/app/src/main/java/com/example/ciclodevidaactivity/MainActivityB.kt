package com.example.ciclodevidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ciclodevidaactivity.databinding.ActivityMainBBinding

class MainActivityB : AppCompatActivity() {

    private lateinit var binding: ActivityMainBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getExtra()
    }

    private fun getExtra(){
        val user = intent.getSerializableExtra("user") as User
        Log.i("TAG", "getExtra: ${user.name}")
        Log.i("TAG", "getExtra: ${user.age}")
    }

}