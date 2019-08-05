package com.pratice.basic.syntax

// 데이터클 생성자
data class User4(val nickName : String, val isSuccess : Boolean = true)

// 생성자 키워드는 생략가능
class Customer constructor(name : String){
    init{
        println("생성쟈 : ${name}")
    }
}

// 보조 생성자
class Customer2 {
    // 프로퍼티가 선언되면 겟터 셋터 제공
    var name : String? = null
    var age : Int? = null

    // name을 받고 age는 디폴트 생성자 추가호출
    constructor(name : String) : this(name, 0){
        this.name = name
        println("생성자1")
    }

    // 한번에 name, age 호출 생성자
    constructor(name : String, age : Int){
        this.name = name
        this.age = age
        println("생성자2")
    }

    constructor() : this("아무개"){
        println("기본생성자")
    }

    override fun toString(): String {
        return "Customer2(name=$name, age=$age)"
    }
}

// 비접근 생성자
class PrivateClass private constructor(){}

fun main(arg : Array<String>){
    println(Customer2("포키").toString())
    println(Customer2().toString())
}