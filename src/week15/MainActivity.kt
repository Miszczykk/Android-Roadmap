package com.example.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.greetButton)
        val editText = findViewById<EditText>(R.id.nameInput)
        val textView = findViewById<TextView>(R.id.resultText)

        button.setOnClickListener {
            val name = editText.text.toString()

            if(name.isNotEmpty()){
                textView.text = "Hi $name! Nice to see you."
            }else{
                val toast = Toast.makeText(this, "Introduce yourself", Toast.LENGTH_SHORT)
                toast.show()
                editText.error = "No name"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}