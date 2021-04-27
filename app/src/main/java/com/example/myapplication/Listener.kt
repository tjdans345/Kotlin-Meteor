package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Kotlin.hello
import com.example.myapplication.Kotlin.number
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // 뷰를 activity로 가져오는 방법
        // 1> 직접 찾아서 가져온다.
        // 2> xml을 import해서 가져온다.
        // hello

        // 익명함수
        // 1 -> 람다 방식
//        hello3.setOnClickListener {
//            Log.d("click" , "Click!!")
//        }

        // 2-> 익명 함수 방식
//        hello3.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                Log.d("click", "Click")
//            }
//        })

        //3 -> 이름이 필요한 경우(click)
        val click = object : View.OnClickListener {
            override fun onClick(v: View?) {
                hello3.setText("안녕하세요")
                image.setImageResource(R.drawable.bear)
                number += 10
                Log.d("number", "" + number)
            }
        }

        hello3.setOnClickListener(click)

        // 뷰를 조작 하는 함수들
        // 1> setText("안녕하세요")
        // 2> setImageResource

    }




}