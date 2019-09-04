package com.waiver.surf.study.example.basic

// 고차함수, 함수 참조를 인자로 넘기거나 함수참조를 반환하는것
fun main(args : Array<String>){
    // 함수형 변수: 선언시에는 (arg1,arg2)를 정의하고 -> (반환타입) = {함수참조}로 구성
    val pow : (Int) -> Int = {n -> n * n}
    println(pow(4))
    val sum = {x: Int, y: Int -> x + y}
    println(sum(10,20))

    // 고차함수 호출
    println(gocha {a,b -> a*b})
    println(gocha {a,b -> a-b})
}

// 고차함수
fun gocha(op : (Int, Int) -> Int) : Int{
    return op(100,50)
}