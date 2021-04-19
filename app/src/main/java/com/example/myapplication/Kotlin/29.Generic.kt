package com.example.myapplication.Kotlin

// 29. Generic(제너릭)
// 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션
//        클래스에서 컴파일 시에 타입을 체크해주는 기능 -> 타입을 체크하는 기능
//       - 제너릭은 ㅁ나들기 어렵고 실제로 만들일 거의 없기 때문에 사용하는 방법만 숙지한다

fun main(arge:Array<String>) {

    // 제너릭을 사용하지 않은 경우
    val list1 = listOf(1,2,3, "가")
    val b: String = list1[2].toString() // 형변환(타입 변환) <캐스팅>

    // 제너릭을 사용하는 경우 -> 타입이 안전 하다
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String타입 이라는 것을 보장 받는다.

    // 강한 타입을 체크 할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    val list4 = listOf<Int>(1,2,3) //강한 타입체크

    // 제너릭을 사용 하지 않은 경우
    val list5 = listOf(1,2,3,"가") // -> Any라는 타입임 프로그램에서 아무거나라는 타입은 없다
    // 부모 : Any , 자식 : String, Int, Float
    // 상속이 만들어낸 특징
    // - 자식은 부모 클래스의 타입이다
    // - 부모 클래스는 자식 클래스의 타입이 아니다!

}
