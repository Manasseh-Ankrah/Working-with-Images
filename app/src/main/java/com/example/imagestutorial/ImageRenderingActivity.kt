package com.example.imagestutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imagestutorial.databinding.ImageMainBinding

class ImageRenderingActivity : AppCompatActivity() {
    //Initializing bindings
    private lateinit var binding: ImageMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflate the activity binding
        binding = ImageMainBinding.inflate(layoutInflater )
        val view = binding.root
        setContentView(view)

        binding.switchFruit.setOnCheckedChangeListener {_, isChecked ->
            if (isChecked) {
                binding.imageViewFruit.setImageResource(R.drawable.grapes)
                binding.switchFruit.text = getString(R.string.string_grapes)

            } else {
                binding.imageViewFruit.setImageResource(R.drawable.apple)
                binding.switchFruit.text = getString(R.string.switch_apple)

            }
        }



    }
}