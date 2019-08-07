package com.waiver.beginner.example.반복문

import java.util.*


fun mapLoop(){
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps.put(c, binary)
    }
    for( (key, value) in binaryReps ){
        println("$key = $value")
    }
}

fun listLoop(){
    val list = arrayListOf(1,2,3,4,5)

    // 인덱스 생성후 동시 출력
    for((idx,value) in list.withIndex()){
        println("$idx: $value")
    }

    // 데이터만 출력
    for(data in list){
        println("$data")
    }
}

fun main(args : Array<String>){
    for(i in 1..10){
        // 숫자 1씩증가
    }
    for(i in 1 until 10 step 2){
        // 숫자 2증가
    }
    for(i in 10 downTo 1 step 2){
        // 숫자 2 다운
    }

    // forEach With Index type1
    for((idx,value) in arrayOf(1,2).withIndex()){
        println("$idx is $value")
    }

    // forEach With Index type2
    listOf('a','b')
            .forEachIndexed { idx, value ->
                println("$idx is $value")}

    // forEach With Index type3
    for(i in arrayOf(5,6).indices){
        println("$i : ${arrayOf(5,6)[i]}")
    }
}