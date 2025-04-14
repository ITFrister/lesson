package com.example.lesson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var submitButton: Button
    private lateinit var confirmPasswordEdit: EditText
    private lateinit var newPasswordEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton = findViewById(R.id.submitButton)
        confirmPasswordEdit = findViewById(R.id.confirmPasswordEdit)
        newPasswordEdit = findViewById(R.id.newPasswordEdit)

        submitButton.setOnClickListener {
            if (newPasswordEdit.text.isEmpty() && confirmPasswordEdit.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Введите новый пароль!!!",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (newPasswordEdit.text.length < 8 && confirmPasswordEdit.text.length < 8) {
                Toast.makeText(
                    this,
                    "Длина не должно быть меньше 8",
                    Toast.LENGTH_SHORT
                ).show()
            } else if(newPasswordEdit.text.toString() != confirmPasswordEdit.text.toString()) {
                Toast.makeText(
                    this,
                    "Пароли не совподают",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Пароль успешно сохранено",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}