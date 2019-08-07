
fun main(args : Array<String>){
    // 변수 (일반)
    var content : String = "Waiver Surf"

    // 변수 (함수형)
    var funcValue : String
            = if(args.isNotEmpty()) args[0] else "NULL"

    // 상수
    val string = "스트링"
    val int = 42
    val long = 18L
    val float = 1.35F
    val double = 7.5e45

    // 배열
    val arrays = arrayListOf(funcValue, string, int, long, float, double)
    arrays.forEach {
        println("${it} (${it.javaClass.name})")
    }

    // 리터럴 출력 예시
    println("double is bigger than float? ${double > float}")
    println("intValue is $int")
    println("floatValue is ${string}")

    // 문자열 리스트로 쪼개기
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split("."))
    println("12.345-6.A".split(".", "-"))

    // 문자열 자르기
    val str = "Waiver/Surf/Pool/Sea/Ship"
    println(str.substringBefore("/"))
    println(str.substringAfter("/"))
    println(str.substringBeforeLast("/"))
    println(str.substringAfterLast("/"))

    // Long이면 변환 아니면 오류..
    val convertLong = 1919L as? Long? ?: throw IllegalAccessError()
    println("$convertLong (${convertLong.javaClass.name})")
}