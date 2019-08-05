package com.pratice.basic.syntax

// 자식
class Children : Parentren(){
    // 멤버 오버라이딩
    override var str = "DEF"

    // 메소드 오버라이딩
    override fun aa(){
    }
}

// 부모
open class Parentren{
    open var str = "ABC"

    // 오픈을해야 자식이 메소드 오버라이딩가능
    open fun aa() {
    }
}


