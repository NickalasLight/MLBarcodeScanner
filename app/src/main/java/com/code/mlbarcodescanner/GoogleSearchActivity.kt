package com.code.mlbarcodescanner

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_googlesearch.*
import android.webkit.WebViewClient



class GoogleSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_googlesearch)
        // Add this at the end of onCreate function
       var barcode = intent.getStringExtra("barcode")

        val myWebView: WebView = googlesearchwebview


        myWebView.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return false
            }
        })


        myWebView.loadUrl("https://www.google.com/search?q=$barcode")
       // setContentView(myWebView)




    }

}