package com.pratice.basic.syntax

fun main(args : Array<String>){
    val obj = DataCooless(name = "Waiver", age = 10)
    println(obj.toString())
}

// 자동으로 데이터에 필요한 메소드 생성해준다.
// 추상화나 sealed 불가
// ToString 생성됨
data class DataCooless(val name : String, val age : Int)