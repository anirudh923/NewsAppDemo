package com.anirudh.basicapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PunjabiNewsChannel : AppCompatActivity() {
    lateinit var btNews18Punjab: Button
    lateinit var btPtcNews: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_punjabi_news_channel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btNews18Punjab=findViewById(R.id.btNews18)
        btPtcNews=findViewById(R.id.btPtcNews)

        btNews18Punjab.setOnClickListener{
            val intent= Intent(this,News18Punjab::class.java)
            startActivity(intent)
        }
        btPtcNews.setOnClickListener{
            val intent= Intent(this,PTCNews::class.java)
            startActivity(intent)
        }

    }
}