package com.example.myapplication.Kotlin

// 27. Interface

fun main(args:Array<String>) {
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()
}

// 상속
open class Person() {

    open fun eat() {

    }

    open fun sleep() {

    }


}

class Student():Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher(): Person() {

}

// 27. Interface
// - 인터페이스는 약속 ! -> 니가 이것을 구현하면 너도 이 타입이다!
// - 인터페이스를 상속받으면 인터페이스안의 함수를 무조건 구현해줘야한다.
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다!
// - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라!
// - 구현은 임플리먼트 받는 클래스의 각 기능이 많이 차이날 때

// 상속이 만들어낸 특징
// - 자식은 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다!

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징

interface  Person_ {
    //구현부가 없다
    fun eat()
    fun sleep()
}

class Student_: Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlayer: Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}