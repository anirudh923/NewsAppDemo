package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HindustanTimes : AppCompatActivity() {
    lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hindustan_times)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        webView=findViewById(R.id.WvHindustanTimes)
        webView.loadUrl("https://www.hindustantimes.com/")
        webView.webViewClient= WebViewClient()
        webView.settings.javaScriptEnabled=true
        webView.settings.loadsImagesAutomatically=true
    }
    override fun onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack()
        }else {
            super.onBackPressed()
        }
        }
}