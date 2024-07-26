package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PTCNews : AppCompatActivity() {
    lateinit var wvPTC: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ptcnews)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        wvPTC=findViewById(R.id.wvPTC)
        wvPTC.loadUrl("https://www.ptcnews.tv/new-ptc-live")
        wvPTC.settings.javaScriptEnabled=true
        wvPTC.webViewClient= WebViewClient()
        wvPTC.settings.loadsImagesAutomatically=true
    }

    override fun onBackPressed() {
        if (
            wvPTC.canGoBack()
        ) {
            wvPTC.goBack()
        } else (

        super.onBackPressed()
                )
    }
}