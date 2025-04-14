package com.example.lesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

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
    }
}