package com.example.myapplication

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

// Copyright (c) 2019 Leonid Titov, Mentions Highly Appreciated

class WebAppInterface(private val mContext: Context) {
    /** Show a toast from the web page  */
    @JavascriptInterface
    fun showToast(toast: String) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
    }
}