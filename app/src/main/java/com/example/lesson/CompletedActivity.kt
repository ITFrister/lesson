package com.example.lesson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.databinding.ActivityCompletedBinding

class CompletedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCompletedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompletedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}