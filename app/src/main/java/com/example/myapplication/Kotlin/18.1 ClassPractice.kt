package com.example.myapplication.Kotlin

// 18. Class

// 절차 지향 vs 객체 지향

// 클래스 생성 1
class Computer(var cpu: String, var mainboard: String, var ssd: String) {

}
// 클래스 생성 2
class Computer2{
    var cpu:String
    var mainboard: String
    var ssd: String

    constructor(cpu: String, mainboard: String, ssd: String) {
        this.cpu = cpu
        this.mainboard = mainboard
        this.ssd = ssd
    }

// 클래스 생성 3 -> 1번 방법의 확장
class Computer3(cpu: String, mainboard: String) {
    var ssd:String = ""

    constructor(cpu: String, mainboard: String, ssd: String): this(cpu,mainboard) {
        this.ssd = ssd
    }
}

// 클래스 생성 4 -> 2번 방법의 확장 / 생성자 2개 생성
class Computer4 {
    var cpu:String
    var mainboard: String
    var ssd: String



    constructor(cpu: String) {
        this.cpu = cpu
        this.mainboard = ""
        this.ssd = ""
    }

    constructor(cpu: String, mainboard: String) {
        this.cpu = cpu
        this.mainboard = mainboard
        this.ssd =""
    }

    constructor(cpu: String, mainboard: String, ssd: String) {
        this.cpu = cpu
        this.mainboard = mainboard
        this.ssd = ssd
    }


}

}

fun main(array: Array<String>) {
    // 인스턴스화
    Computer(cpu = "i10-10650", mainboard = "msi", ssd = "512")

    // 인스턴스화 2
    var goodComputer = Computer(cpu = "i9", mainboard = "asus", ssd = "256")
    // 인스턴스화 3
    var nomalComputer: Computer = Computer(cpu = "i8", mainboard = "msi", ssd = "128")
    // 인스턴스화 4
}