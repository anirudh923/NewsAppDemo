package com.anirudh.basicapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ABPnews : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_abpnews)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        webView=findViewById(R.id.wvABPnews)
        webView.loadUrl("https://www.abplive.com/live-tv")
        webView.settings.javaScriptEnabled=true
        webView.webViewClient= WebViewClient()
        webView.settings.loadsImagesAutomatically=true
    }

    override fun onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack()
        }
        else(
        super.onBackPressed()
                )
    }
}