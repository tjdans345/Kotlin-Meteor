package com.example.myapplication.Kotlin

// 10 제어흐름

// When

fun main(args: Array<String>) {

    val value: Int = 2

    when(value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("value is not")
        }
    }


}