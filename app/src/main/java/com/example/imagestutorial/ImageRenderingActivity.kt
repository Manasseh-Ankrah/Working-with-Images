package com.example.imagestutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imagestutorial.databinding.ImageMainBinding
import com.google.android.material.snackbar.Snackbar

class ImageRenderingActivity : AppCompatActivity() {
    //Initializing bindings
    private lateinit var binding: ImageMainBinding
    private var fruits = listOf(R.drawable.apple,R.drawable.grapes)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflate the activity binding
        binding = ImageMainBinding.inflate(layoutInflater )
        val view = binding.root
        setContentView(view)


        binding.btnRandom.setOnClickListener {
            val randomFruit: Int = (fruits).shuffled().first()
            binding.imageViewFruit.setImageResource(randomFruit)
//            Snackbar.make(it,"The random number is $randomFruit",Snackbar.LENGTH_LONG).show()
        }
        binding.switchFruit.setOnCheckedChangeListener {_, isChecked ->
            toggleImage(isChecked)
        }
    }

    private fun toggleImage(isChecked: Boolean) {
        if (isChecked) {
            binding.imageViewFruit.setImageResource(R.drawable.grapes)
            binding.switchFruit.text = getString(R.string.switch_apple)

        } else {
            binding.imageViewFruit.setImageResource(R.drawable.apple)
            binding.switchFruit.text = getString(R.string.string_grapes)

        }
    }
}