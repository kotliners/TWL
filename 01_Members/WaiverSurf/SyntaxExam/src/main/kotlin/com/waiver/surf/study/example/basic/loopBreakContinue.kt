
fun main(args : Array<String>){
    val array = arrayOf(1,2,3,4,5)

    // 레이블을 지정하여 한번에 이중 루프를 탈출가능
    // 람다에서 리턴하면 Nested 자체 전체 함수가 종료됨, 그래서 해당 건만 스킵하려면 레이블사
    array.forEach lamda@{
        println(it)
        if (it == 2) {
            return@lamda
            // 이렇게되면 함수를 리턴이 아니라 이 레이블리턴으로 람다만 종료
        }
    }

    array.forEach {
        println(it)
        if (it == 2) {
            return@forEach // 예약어!
            // 이렇게되면 함수를 리턴이 아니라 이 레이블리턴으로 람다만 종료
        }
    }

    waiver@ for(i in array){
        for(i in array.indices){
            println("$i : ${array[i]}")
            // 상위 waiver로 이동
            break@waiver
        }
    }

    surf@ for(i in array){
        for(i in array.indices){
            println("$i : ${array[i]}")
            // 상위 surf로 이동
            continue@surf
        }
    }

}