package com.waiver.surf.study.example.basic

import kotlinx.coroutines.*

class CoroutinesEach{
    // 논블럭킹
    private fun nonBlock() : Unit{
        GlobalScope.launch {
            println("${Thread.currentThread()} nonBlock scope")
        }
    }

    // 블럭킹
    private fun block(){
        runBlocking {
            launch {
                println("${Thread.currentThread()} block scope")
            }
        }
    }

    fun startExam(){
        // 호출한 스레드가 소멸되면 루틴 실행이 되지 않는다.
        block()
        nonBlock()
        println("${Thread.currentThread()} i am main scope")
        Thread.sleep(500)
    }
}

// 한 블럭 내에서 두개의 루틴이 함께 공존
class coroutineYield {
    fun startExam(){
        runBlocking {
            // 루틴 A
            println("A START")
            launch {
                println("1")
                yield() // 다른 루틴으로 양보
                println("3")
                yield()
                println("5")
            }
            println("A END")

            // 루틴 B
            println("B START")
            launch {
                println("2")
                delay(500) // 휴식 다른루틴으로 양보됨
                println("4")
                delay(500)
                println("6")
            }
            println("B END")
        }
    }
}

class coroutineAsync {
    // 루틴 비동기 without thread
    fun startExam() {
        val start = System.currentTimeMillis()
        runBlocking {
            val one = async { delay(1000); println("${Thread.currentThread().name} : 10");10 }
            println("${Thread.currentThread().name} : ${one}")
            val two = async { delay(2000); println("${Thread.currentThread().name} : 20"); 20 }
            println("${Thread.currentThread().name} : ${two}")
            val sam = async { delay(3000); println("${Thread.currentThread().name} : 30"); 30 }
            println("${Thread.currentThread().name} : ${sam}")
            println("${Thread.currentThread().name} : ${one.await() + two.await() + sam.await()}")
        }
        println("${System.currentTimeMillis() - start} Ms")
    }
}


class coroutineThread {
    fun startExam(){
        // 스레드 waiver open
        newSingleThreadContext("waiver").use { waiver ->
            // 스레드 surf open
            newSingleThreadContext("surf").use { surf ->
                // 열어둔 waiver thread로 루틴 동작시작
                runBlocking(waiver) {
                    println("threadId->${Thread.currentThread().id}:waiver -> ${coroutineContext[Job]}")
                    // 잠시 펜딩하고 surf 스레드 루틴 동작시작
                    withContext(surf) {
                        println("threadId->${Thread.currentThread().id}:surf -> ${coroutineContext[Job]}")
                    }
                }
            }// end of surf thread
        }// end of waiver thread
    }
}

fun main(args : Array<String>) : Unit{
//    CoroutinesEach().startExam()
//    coroutineYield().startExam()
//    coroutineAsync().startExam()
    coroutineThread().startExam()
}