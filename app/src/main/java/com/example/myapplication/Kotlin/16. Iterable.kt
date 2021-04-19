package com.example.myapplication.Kotlin

// 16. Iterable

fun  main(array: Array<String>) {

    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)


    // 반복하는 방법 (1)
    for (item in a) {
        println(item)
    }

    // 반복하는 방법 (2)
    // 인덱스를 알고싶을 때
    for ((index, item) in a.withIndex()) {
        //println("index : " + index + " value : " + item)
        println("index : $index value : $item")
    }
    // 문자열 + Int(정수) = 문자열
    // 문자열 + 아무거나 = 문자열
    println()
    println("반복 3")
    // 반복하는 방법 (3)
    a.forEach {
        println(it)
    }

    // 반복하는 방법 (4)
    a.forEach { item ->
        println(item)

    }

    // 반복하는 방법 (5)
    println("인덱스, 아이템 람다")
    a.forEachIndexed {index, item ->
        println("index $index value : $item")
    }

    println()
    // 반복하는 방법(6)
    println(a.size)
    println()
    for (i in 0 until a.size) {
        // until은 마지막을 포함하지 않는다.
        // 0부터 8까지 이다

        println(a.get(i))
    }
    println()
    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
            println(a.get(i))
    }
    println()
    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) {
        // 8부터 0 까지 반복
        println(a.get(i))
    }
    println()
    // 반복하는 방법 (9)
    for (i in a.size -1 downTo (0) step (2)) {
        println(a.get(i))
    }

    // 반복하는 방법 (10)
    for (i in 0..10) {
        // .. -> 마지막을 포함한다.
        println(i)
    }

    println()
    // 반복하는 방법 (11)
    var b: Int = 0
    var c: Int = 4

    while (b < c ) {
        b++ // while문을 정지 시키기 위한 코드
        println("b")
    }

    var d: Int = 0
    var e: Int = 4

    // 반복하는 방법(12)
        //do While문은 무조건 최초 1번은 실행 되어진다.
    do {
        println("hello")
    } while ( d < e )



}