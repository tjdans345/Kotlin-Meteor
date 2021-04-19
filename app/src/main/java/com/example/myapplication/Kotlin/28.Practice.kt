package com.example.myapplication.Kotlin

// 28. 인터페이스
// - 인터페이스도 구현이 있는 함수를 만들 수 있다
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 구현할 필요가 없다
// - 인터페이스 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반드시 구현해야한다.
// abstract키워드는 반드시 구현해야하는 함수로 만들어준다.
fun main(args:Array<String>) {
    val student = Student__()
    student.sleep()

}

// 인터페이스에서도 구현을 할 수 있다.
interface  Person__ {
    //구현부가 없다
    fun eat() {
        println("먹는다")
    }
    fun sleep() {
        println("잔다")
    }

    fun study()
}

class Student__: Person__ {
    override fun study() {

    }
}

class SoccerPlayer_: Person__ {
    override fun study() {

    }
}