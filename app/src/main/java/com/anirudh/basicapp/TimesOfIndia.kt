package com.anirudh.basicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TimesOfIndia : AppCompatActivity() {
    lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_times_of_india)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        webView=findViewById(R.id.WvTimesOfIndia)
        webView.loadUrl("https://timesofindia.indiatimes.com/")
        webView.settings.javaScriptEnabled=true
        webView.webViewClient= WebViewClient()
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