package com.example.myapplication_constrainlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnSiswa)
        val button1 = findViewById<Button>(R.id.btnGuru)

        button.setOnClickListener {
            val Intent = Intent( this, MainActivity2::class.java)
            startActivity(Intent)
        }

        button1.setOnClickListener {
            val Intent = Intent( this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}