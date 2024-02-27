package com.example.imagestutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imagestutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Initializing bindings
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflate the activity binding
        binding = ActivityMainBinding.inflate(layoutInflater )
        val view = binding.root
        setContentView(view)
    }
}