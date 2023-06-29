package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_result = findViewById<TextView>(R.id.txtResult)
        val btn_increase = findViewById<Button>(R.id.btn)
        //Button click event
        btn_increase.setOnClickListener(){
            tv_result.setText(""+increaseByOne())
        }
    }

    //This function increase counter by 1, when the user clicks the button
    fun increaseByOne():Int {
        counter++
        return counter
    }
}