package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LanguagePage : AppCompatActivity() {
    lateinit var btEnglish:Button
    lateinit var btHindi:Button
    lateinit var btPunjabi:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_language_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btEnglish=findViewById(R.id.btEnglish)
        btHindi=findViewById(R.id.btHindi)
        btPunjabi=findViewById(R.id.btPunjabi)

        btHindi.setOnClickListener{
            val intent= Intent(this,HindiNewsChannel::class.java)
            startActivity(intent)
        }


        btEnglish.setOnClickListener{
            val intent= Intent(this,EnglishNewsChannel::class.java)
            startActivity(intent)
        }

        btPunjabi.setOnClickListener{
            val intent= Intent(this,PunjabiNewsChannel::class.java)
            startActivity(intent)
        }
       

    }

}