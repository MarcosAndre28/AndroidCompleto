package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.radiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGrup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                R.id.radioButton ->{
                    Log.i("INFOGRUP", "Opção 1")
                }
                R.id.radioButton2 ->{
                    Log.i("INFOGRUP", "Opção 2")
                }
                R.id.radioButton3 ->{
                    Log.i("INFOGRUP", "Opção 3")
                }
            }
        }
    }
}