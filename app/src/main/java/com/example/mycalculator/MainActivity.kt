package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNumbers()
        subNumbers()
        multiplyNumbers()
        modulusNum()

        }

    fun addNumbers() {
        var sumNum1 = findViewById<EditText>(R.id.number1)
        var sumNum2 = findViewById<EditText>(R.id.number2)
        var button1 = findViewById<Button>(R.id.btn_add)
        button1.setOnClickListener {
            var addNum1 = sumNum1.text.toString().toInt()
            var addNum2 = sumNum2.text.toString().toInt()
            var answer = addNum1 + addNum2
            Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()
        }
    }
    fun subNumbers(){
        var subNum1=findViewById<EditText>(R.id.number1)
        var subNum2=findViewById<EditText>(R.id.number2)
        var button2=findViewById<Button>(R.id.btn_sub)
        button2.setOnClickListener {
            var subsNum1=subNum1.text.toString().toInt()
            var subsNum2=subNum2.text.toString().toInt()
            var difference=subsNum1-subsNum2
            Toast.makeText(this,"$difference",Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers(){
        var mulNum1=findViewById<EditText>(R.id.number1)
        var mulNum2=findViewById<EditText>(R.id.number2)
        var button3=findViewById<Button>(R.id.btn_mul)
        button3.setOnClickListener {
            var multiplyNum1=mulNum1.text.toString().toInt()
            var multiply2Num2=mulNum2.text.toString().toInt()
            var product=multiplyNum1*multiply2Num2
            Toast.makeText(this,"$product",Toast.LENGTH_SHORT).show()
        }
    }

    fun modulusNum(){
        var modulusNum1=findViewById<EditText>(R.id.number1)
        var modulusNum2=findViewById<EditText>(R.id.number2)
        var button4=findViewById<Button>(R.id.btn_div)
        button4.setOnClickListener {
            var modulusNum1=modulusNum1.text.toString().toInt()
            var modulusNum2=modulusNum2.text.toString().toInt()
            var dividend=modulusNum1%modulusNum2
            Toast.makeText(this,"$dividend",Toast.LENGTH_SHORT).show()
        }
    }

}
