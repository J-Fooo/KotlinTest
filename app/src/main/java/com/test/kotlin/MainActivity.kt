package com.test.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //val声明声明局部常量

    //var变量声明

    var name:String = "ddd"

    private var intA: Int = 155
    private var intB: Int? = intA
    private var isSame: Boolean? = null
    private var ddd: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvMain = findViewById<TextView>(R.id.tv_main)
        isSame = intA == intB
        Log.e("Kotlin", "$isSame")
        val isNum: Boolean
        isNum = false

        name.length
    }

    private fun add(a: Int, b: Int): Int {
        val test = Test()
        val c = test.testIntA
        return a + b + c
    }

    class Test {
        var testIntA: Int = 20;
        var testStrA: String = "kotlin"
    }
}
