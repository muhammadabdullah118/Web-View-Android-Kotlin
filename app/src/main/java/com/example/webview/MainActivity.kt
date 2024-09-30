package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wv_youtube = findViewById<WebView>(R.id.wv_url)

        val wv_set = wv_youtube.settings

        //comment for github

        wv_set.javaScriptEnabled = true

        wv_youtube.loadUrl("https://www.youtube.com/")

        wv_youtube.webViewClient = object  : WebViewClient(){

        }
    }
}