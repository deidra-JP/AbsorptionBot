package com.example.absorptionbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text = intent.getStringExtra("TEXT_KEY")
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(text)
    }
}