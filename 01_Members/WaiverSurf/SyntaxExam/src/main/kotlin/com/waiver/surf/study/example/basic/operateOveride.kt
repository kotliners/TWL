package com.waiver.surf.study.example.basic

// 이항 산술연산 오버로딩
data class Point(val x:Int, val y:Int){
    // 같은타입
    operator fun plus(another: Point): Point = Point(x + another.x, y + another.y)
    operator fun minus(another: Point): Point = Point(x - another.x, y - another.y)
    operator fun times(another: Point): Point = Point(x * another.x, y * another.y)
    operator fun div(another: Point): Point = Point(x / another.x, y / another.y)
    operator fun rem(another: Point): Point = Point(x % another.x, y % another.y)

    // 다른타입
    operator fun plus(another: Int): Point = Point(x + another, y + another)
}

fun main(args : Array<String>){
    println(Point(10,10) + Point(10,10))
    println(Point(10,10) - Point(10,10))
    println(Point(10,10) * Point(10,10))
    println(Point(10,10) / Point(10,10))
    println(Point(10,10) % Point(10,10))
    println(Point(10,10) + 1000)

    // 대입연산자는 operator 선언도면 함께 처리되며 이용가능
    var point = Point(10,10)
    point += 25
    point += Point(4,3)
    println(point)


}