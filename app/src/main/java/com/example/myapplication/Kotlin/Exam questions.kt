package com.example.myapplication.Kotlin

// 1번 문제


fun main(array: Array<String>) {

    // 1번 문제
    val firstList = mutableListOf<Int>()
    val secondList = mutableListOf<Boolean>()

    //0부터 9까지 값을 넣어줌
    for (i in 0 until 10) {
        firstList.add(i, i)
    }

    for (i in firstList) {
        // 짝수면 true 바인딩
        if (firstList[i] % 2 == 0) {
            secondList.add(i, true)
        }
        // 홀수면 false 바인딩
        else {
            secondList.add(i, false)
        }

        //결과 출력
        for ((index, item) in secondList.withIndex()) {
            println("index : $index value : $item")
        }
    }

    // 2번 문제
    //학점을 입력해주세요
    var score: Int = 90

    println()
    findLevel(score)

    // 3번 문제
    // 전달 받은 숫자의 각 자리 숫자의 합을 구하자
    sumMethod(99)

    // 4번 문제
    // 구구단을 출력하시오
    guguMethod();

}

fun findLevel(score: Int): Unit {

    when (score) {
        in 80..90 -> {
          return println("A등급 입니다.")
        }
        in 70..79 -> {
          return println("B등급 입니다.")
        }
        in 60..69 -> {
          return println("C등급 입니다.")
        }
        else -> {
          return println("F등급 입니다.")
        }
    }
}

fun sumMethod(num: Int): Unit {
    var num: Int = num
    var sum: Int = 0;
    var test: Int = 99

    if (num > test) {
        println("99이하의 정수만 입력해 주세요.")
    } else {
        while (num != 0) {
            sum += num % 10
            num /= 10
        }
        println("각 자리수의 합은 $sum 입니다.")
    }
}

fun guguMethod(): Unit {

    val bdulgi1 = mutableListOf<Int>()
    val bdulgi2 = mutableListOf<Int>()

    for (i in 1 until 10) {
        bdulgi1.add(i - 1, i)
        bdulgi2.add(i - 1, i)
        println("b1 ${bdulgi1.get(i - 1)} , b2 ${bdulgi2.get(i - 1)}")
    }

    // 첫 번째 방법
//    bdulgi1.forEach {
//      item ->
//        println("${bdulgi1.get(item-1)} 단입니다.")
//        bdulgi2.forEach {
//            item2 ->
//            println("${bdulgi1.get(item-1)} x ${bdulgi2.get(item2-1)} = ${bdulgi1.get(item2-1) * bdulgi2.get(item2-1)}")
//        }
//        println()
//    }

    // 두 번째 방법
    for (i in bdulgi1) {
        println("${bdulgi1.get(i - 1)} 단입니다.")

        for (j in bdulgi2) {
            println(
                "${bdulgi1.get(i - 1)} x ${bdulgi2.get(j - 1)} = ${bdulgi1.get(i - 1) * bdulgi2.get(
                    j - 1
                )} "
            )
        }
        println()
    }


}