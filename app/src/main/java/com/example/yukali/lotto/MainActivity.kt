package com.example.yukali.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //先做繼承
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t: TextView = findViewById(R.id.txv)
        t.text = "app"
    }
}