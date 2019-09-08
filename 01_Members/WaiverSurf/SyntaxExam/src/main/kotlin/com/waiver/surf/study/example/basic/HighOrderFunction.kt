package com.waiver.surf.study.example.basic

import java.util.stream.Collectors


fun main(args : Array<String>){
    // 변수형 함수
    varFunction()

    // 고차함수 호출
    println(gocha {a,b -> a*b})
    println(gocha {a,b -> a-b})

    // 함수 반환함수
    println(returnLamda(1)(7))
    println(returnLamda(2)(5))

    // 람다식 전달
    println(lamdaParam { x -> x % 2 == 0 })
    println(lamdaParam { x -> x % 3 == 0 })
}

// 변수형 함수
fun varFunction(){
    // 함수형 변수: 선언시에는 (arg1,arg2)를 정의하고 -> (반환타입) = {함수참조}로 구성
    val pow : (Int) -> Int = {n -> n * n}
    println(pow(4))
    val sum = {x: Int, y: Int -> x + y}
    println(sum(10,20))
}

// 고차함수: 함수 참조를 인자로 넘기거나 함수참조를 반환하는것
fun gocha(op : (Int, Int) -> Int) : Int{
    return op(100,50)
}

// 함수반환 함수
fun returnLamda(value : Int) : (Int) -> (Int) {
    return when(value){
        1 -> { vv -> vv * vv }
        2 -> { xx -> xx + 2}
        else -> { cc -> cc }
    }
}

// 람다식을 받아 처리하는 함수안의 함수형
fun lamdaParam(predicate: (Int) -> Boolean) : Boolean{
    val cnt = listOf(2,4,8).stream().filter(predicate).collect(Collectors.counting())
    return (cnt > 0)
}