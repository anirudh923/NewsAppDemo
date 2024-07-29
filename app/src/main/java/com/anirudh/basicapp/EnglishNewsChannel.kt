package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnglishNewsChannel : AppCompatActivity() {
    lateinit var btHindustanTimes: Button
    lateinit var btTimesOfIndia: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_english_news_channel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btHindustanTimes = findViewById(R.id.btHindustanTimes)
        btTimesOfIndia = findViewById(R.id.btTimesOfIndia)


        btHindustanTimes.setOnClickListener {
            val intent = Intent(this, HindustanTimes::class.java)
            startActivity(intent)
        }


        btTimesOfIndia.setOnClickListener {
            val intent = Intent(this, TimesOfIndia::class.java)
            startActivity(intent)
        }
    }
}