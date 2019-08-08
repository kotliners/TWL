
fun main(a : Array<String>){
    readOnly() // 읽기전용
    everyOnly() // 읽기쓰기

    // 널로 구성된 배열 생성
    println(arrayOfNulls<Int>(10).size)
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


