package com.example.ciclodevidaactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.ciclodevidaactivity.databinding.ActivityMainABinding
import com.example.ciclodevidaactivity.databinding.ActivityMainBBinding

class MainActivityA : AppCompatActivity() {

    private val TAG = "INFOTESTE"
    private lateinit var binding: ActivityMainABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainABinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "onCreate")

        initListeners()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    private fun initListeners(){
        binding.btNext.setOnClickListener {
           resultlauncher.launch(Intent(this,MainActivityB::class.java))
        }
    }

    private val resultlauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        result : ActivityResult ->
        val resultCode = result.resultCode
        val data = result.data

      if (resultCode == RESULT_OK){
          if (data != null){
              if (data.hasExtra("user")){
                  val user = data.getSerializableExtra("user") as User
                  Log.i("TAG", "getExtra: ${user.name}")
                  Log.i("TAG", "getExtra: ${user.age}")
              }
          }
      }
    }
}