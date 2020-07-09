package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class intentproject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentproject)

    val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("태혁",100)
        startActivity(intent) //Ctrl main 누르기


    }
}