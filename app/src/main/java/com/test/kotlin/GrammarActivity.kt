package com.test.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_grammar.*
//Top-Level,顶层属性与函数,作用范围是 pakeage
//const val NUM_B : String = "顶层声明"
class GrammarActivity : AppCompatActivity(), View.OnClickListener {
    //1.3 后期初始化
    /*
    * 使用lateinit关键字后期初始化成员变量
    * */
    private lateinit var mTvVar:TextView
    private lateinit var showLate:String


    //伴生对象中声明常量
    companion object {
        const val NUM_A : String = "伴生对象声明"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar)

        mTvVar = tv_var
        mTvVar.setOnClickListener(this)

        val mTvVal = tv_val
        mTvVal.setOnClickListener(this)

        val mTvNull = tv_null
        mTvNull.setOnClickListener(this)

        val mTvLateInit = tv_lateinit
        mTvLateInit.setOnClickListener(this)

        // 1.1 变量声明
        /*
        var: 用此关键字声明的变量表示可变变量，即可读且可写。相当于Java中普通变量
        val: 用此关键字声明的变量表示不可变变量，即可读且不可写。相当于Java中用final修饰的变量（定义只读局部变量使用关键字 val 定义。只能为其赋值一次。）
        */
        //变量定义格式： 关键字 变量名: 数据类型 = xxx

        /*
        * var
        * */
        //声明变量并立即初始化
        var intA: Int = 1
        //根据初始化值推导出变量数据类型（不需要声明数据类型）
        var intB = 2
        // 如果没有初始值类型不能省略,必须声明类型
        val intC: Int  // 如果没有初始值类型不能省略
        intC = 3       // 明确赋值


        /*
        * val
        * */
        val a: Int = 1  // 立即赋值
        val b = 2   // 自动推断出 `Int` 类型
        val c: Int  // 如果没有初始值类型不能省略
        c = 3       // 明确赋值
        // c += 1 因为c是常量，所以这句代码是会报错的


        //1.2、声明可空变量
        //声明方式：var/val 变量名 ： 类型? = null/确定的值
        //当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
        var var_a : Int? = 0
        val val_a : Int? = null

    }


    override fun onClick(v: View?) {
        when (v?.id){
            R.id.tv_var ->{
                var showStr = "哈哈哈"
                Toast.makeText(this@GrammarActivity,"var声明的变量：$showStr",Toast.LENGTH_SHORT).show()
            }
            R.id.tv_val ->{
                val valShow = "show val"
                Toast.makeText(this@GrammarActivity,"val声明的变量：$valShow",Toast.LENGTH_SHORT).show()
            }
            R.id.tv_null->{
                val showNull:Int? = null
                Toast.makeText(this@GrammarActivity,"声明可空变量：$showNull",Toast.LENGTH_SHORT).show()
            }
            R.id.tv_lateinit->{
                //后期初始成员变量，使用前要进行初始化值
                showLate = "lateInit"
                Toast.makeText(this@GrammarActivity,"属性后期初始化：$showLate",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
