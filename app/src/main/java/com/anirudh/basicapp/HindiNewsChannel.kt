package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HindiNewsChannel : AppCompatActivity() {
    lateinit var btNDtv: Button
    lateinit var btABPnews: Button
    lateinit var btAajtak: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hindi_news_channel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btNDtv=findViewById(R.id.btNdtv)
        btAajtak=findViewById(R.id.btAajtak)
        btABPnews=findViewById(R.id.btAbpNews)
        btNDtv.setOnClickListener {
            val intent = Intent(this,NDtv::class.java)
            startActivity(intent)
        }
        btAajtak.setOnClickListener {
            val intent = Intent(this,AajTak::class.java)
            startActivity(intent)
        }
        btABPnews.setOnClickListener {
            val intent = Intent(this,ABPnews::class.java)
            startActivity(intent)
        }




    }
}