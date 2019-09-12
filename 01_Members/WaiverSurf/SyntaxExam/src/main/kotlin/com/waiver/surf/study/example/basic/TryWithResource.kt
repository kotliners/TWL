package com.waiver.surf.study.example.basic

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLine() : String?{
    // use는 람다를 넘겨 람다가 종료후에 자원을 닫아주는 역할을 한다. (1회성)
    return BufferedReader(FileReader("/home/waiver/read.txt")).use {
        it.readLine()
    }
}
