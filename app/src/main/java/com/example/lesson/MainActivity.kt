package com.example.lesson

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val sleepTime: Long = 0
    private var newPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            if (binding.newPasswordEdit.text.isEmpty() && binding.confirmPasswordEdit.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Введите новый пароль!!!",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (binding.newPasswordEdit.text.length < 8 && binding.confirmPasswordEdit.text.length < 8) {
                Toast.makeText(
                    this,
                    "Длина не должно быть меньше 8",
                    Toast.LENGTH_SHORT
                ).show()
            } else if(binding.newPasswordEdit.text.toString() != binding.confirmPasswordEdit.text.toString()) {
                Toast.makeText(
                    this,
                    "Пароли не совподают",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                var intent = Intent(this@MainActivity, CompletedActivity::class.java)
                startActivity(intent)
            }
        }

        Thread.sleep(sleepTime)

        binding.root.setOnClickListener {
            newPassword = binding.newPasswordEdit.text.toString()
        }

        Log.d("ACTIVITY_LIFECYCLE", "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Thread.sleep(sleepTime)


        Log.d("ACTIVITY_LIFECYCLE", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Thread.sleep(sleepTime)

        Log.d("ACTIVITY_LIFECYCLE", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Thread.sleep(sleepTime)

        Log.d("ACTIVITY_LIFECYCLE", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Thread.sleep(sleepTime)

        Log.d("ACTIVITY_LIFECYCLE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Thread.sleep(sleepTime)

        Log.d("ACTIVITY_LIFECYCLE", newPassword)

        Log.d("ACTIVITY_LIFECYCLE", "onDestroy")
    }
}