package com.waiver.surf.study.example.basic

// 순서연산자
class BeeGun(val firstName:String, val lastName:String) : Comparable<BeeGun>{
    // 크냐 작냐 비교
    override fun compareTo(other: BeeGun): Int {
        return compareValuesBy(this, other, BeeGun::firstName, BeeGun::lastName)
    }
}

fun main(args : Array<String>){
    val a = BeeGun("Kim", "Sun")
    val b = BeeGun("Shin", "Surf")
    println(a > b)
    println(a < b)
}