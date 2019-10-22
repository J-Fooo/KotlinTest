package com.test.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class BaseTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_type)
    }
}
