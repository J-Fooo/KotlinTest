package com.test.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mTVBaseType: TextView
    private lateinit var mTvGrammar: TextView

    private lateinit var mBtnD:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
//        mTvGrammar = findViewById<TextView>(R.id.tv_grammar)
//        mTvGrammar = tv_grammar

        mTvGrammar = tv_grammar
        mTVBaseType = tv_base_type

        mTvGrammar.setOnClickListener(this)
        mTVBaseType.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_grammar -> {
                val intent = Intent(this@MainActivity, GrammarActivity().javaClass)
                startActivity(intent)
            }

            R.id.tv_base_type ->{
                val intent = Intent(this@MainActivity,BaseTypeActivity().javaClass)
                startActivity(intent)
            }
        }
    }

}
