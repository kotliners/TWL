
fun main(args : Array<String>){
    println(OutterSingleTon.cnt++)
    println(OutterSingleTon.cnt++)
    println(InnerSingleTon.cnt++)
    println(InnerSingleTon.cnt++)
    println(InnerSingleTon.cnt++)
}

// 코틀린은 'object' 선언만 하면 싱글톤 패턴으로 구조화 한다.
// 예) 클래스가 필요 없을때..
object OutterSingleTon{
    var cnt = 0
}

// 클래스 내부의 싱글턴
// 예) 클래스안에서 사용할때..
class InnerSingleTon{
    companion object{
        var cnt = 0
    }
}