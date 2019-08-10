
fun main(a : Array<String>){
    readOnly() // 읽기전용
    everyOnly() // 읽기쓰기

    // 널로 구성된 배열 생성
    println(arrayOfNulls<Int>(10).size)


    // 컬렉션 + 시퀀스
    val list = listOf(10, 20, 30)
            .asSequence() // lazy mode
            .filter { x -> x > 10 }
            .map {
                x -> x.toString()
            }
            .toList() // 시퀀스는 이때 모든연산이 실행되는점
    list.forEach { x -> println(x)}

    // 시퀀스 자가 생성
    val naturalNumbers = generateSequence(1) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) // 최종연산을 할때 로직이 실행됨
}

fun readOnly(){
    val list : List<Int> = listOf(1,2,3,4)
    list.let { it.forEach{println(it)} }

    val set : Set<Int> = setOf(5,6,7,8)
    set.let { it.forEach{println(it)} }

    val map : Map<Any, Any> = mapOf('a' to 9, 'b' to 0)
    map.let { it.forEach{println(it)} }

    // 형태 변환
    map.let { map.toMutableMap().forEach{println(it)} }
}

fun everyOnly(){
    val list : MutableList<Int> = mutableListOf(0)
    list.add(1)
    list.forEach { println(it) }

    // 인터페이스 형변환
    list.toList().forEach { println(it) }
}


