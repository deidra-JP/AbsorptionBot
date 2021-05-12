package com.example.absorptionbot


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toNextView(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        val text = "Hello!"
        intent.putExtra("TEXT_KEY",text)
        startActivity(intent)
    }
}