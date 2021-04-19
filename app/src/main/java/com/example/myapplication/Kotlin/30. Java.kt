package com.example.myapplication.Kotlin

import java.util.*

// 한 프로젝트에서 자바와 코틀린 파일이 공존할 수 있다.
// 자바소스코드 복수붙여넣기 하면 자동으로 코틀린으로 변경 됨
// 정상 동작하는 코드를 붙여넣어야 변환이 가능하다
// 자바 코드 복사 후 코틀린 코드로 변환 후 확인하면 좋다

fun main(args:Array<String>) {
    val scan = Scanner(System.`in`)
    print("아무 숫자나 입력해보렴")
    val anyKey: Int = scan.nextInt()
    scan.close()
    var product = anyKey
    println("Output : $product")
}