package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // 뷰를 activity로 가져오는 방법
        // 1> 직접 찾아서 가져온다.
        // 2> xml을 import해서 가져온다.
        // hello
        val textView : TextView = findViewById(R.id.hello3)

        hello3.setOnClickListener {
            Log.d("click2", "CLick!3!")
        }


    }




}