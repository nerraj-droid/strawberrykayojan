package com.example.ucordilleras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ucordilleras.R

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val button = findViewById<Button>(R.id.start)
        button.setOnClickListener {
            val intent = Intent(this, secondact::class.java)
            startActivity(intent)
        }
    }
}