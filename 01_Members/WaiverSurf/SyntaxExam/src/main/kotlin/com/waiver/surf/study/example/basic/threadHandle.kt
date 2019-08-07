fun main(args : Array<String>){
    // for main
    for(i in 0 until 9 step 3){
        println("${Thread.currentThread().name} -> Hello $i")
    }

    // for thread
    for(i in 0 until 9 step 2){
        Thread(Runnable { println("${Thread.currentThread().name} -> Hello $i") }).start()
    }
}