package com.example.countapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText: TextView = findViewById(R.id.numberText)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusBotton)
        val clearButton: Button = findViewById(R.id.clearBotton)

        var num: Int = 0

        plusButton.setOnClickListener {
            num += 1
            /*
            if (num % 3 ==0 && num !=0){
                numberText.setTextColor(Color.parseColor("#ef857d"))
            }else{
                numberText.setTextColor(Color.parseColor("#515151"))
            }
             */
            color(num)
            numberText.text = num.toString()
        }

        minusButton.setOnClickListener {
            num -= 1
            /*
            if (num % 3 ==0 && num !=0){
                numberText.setTextColor(Color.parseColor("#82cddd"))
            }else{
                numberText.setTextColor(Color.parseColor("#515151"))
            }
             */
            color(num)
            numberText.text = num.toString()
        }

        clearButton.setOnClickListener {
            num = 0
            numberText.text = num.toString()
        }
    }
    fun color(num : Int){
        val numberText: TextView = findViewById(R.id.numberText)
        if(num % 3 == 0 && num != 0){
            numberText.setTextColor(Color.parseColor("#ef857d"))
        }else{
            numberText.setTextColor(Color.parseColor("#515151"))
        }
    }

}