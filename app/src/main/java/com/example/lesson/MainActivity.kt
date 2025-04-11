package com.example.lesson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var stepEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.countButton)
        stepEditText = findViewById(R.id.stepEditText)

        var count = textView.text.toString().toInt()

        button.setOnClickListener {
            val step = stepEditText.text.toString().toIntOrNull()

            if(step != null) {
                count += step
                button.text = "+$step"
            } else {
                if (stepEditText.text.isNotEmpty()) Toast.makeText(
                    this,
                    "Шаг задан неверно!",
                    Toast.LENGTH_SHORT
                ).show()
                count++
                button.text = "+1"
            }

            textView.text = count.toString()
        }
    }
}