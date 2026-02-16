package com.example.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
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

        var isElegant = false

        val button = findViewById<Button>(R.id.changeIdentityBtn)
        val textView = findViewById<TextView>(R.id.queAlias)
        val image = findViewById<ImageView>(R.id.queImage)

        val tabImageQue = arrayOf(R.drawable.sleep, R.drawable.well)
        val tabText = arrayOf(R.string.sleep, R.string.well)

        button.setOnClickListener {
            image.setImageResource(tabImageQue[if(isElegant) 0 else 1])
            textView.setText(tabText[if(isElegant) 0 else 1])
            isElegant = !isElegant
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}