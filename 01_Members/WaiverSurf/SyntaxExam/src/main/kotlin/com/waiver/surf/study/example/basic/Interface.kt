
// 인터페이스1
interface Button{
    fun clickable()
    fun printable() = println("call type : ${javaClass.simpleName}")
}

// 인터페이스2
interface Focus{
    fun focusable()
    fun printable(){
        println("call type : ${javaClass.simpleName}")
    }
}

class Waiver : Button, Focus{
    var cnt : Int = 0
        private set // 외부수정 제한

    override fun clickable() {
        println("[${javaClass.simpleName}] click method call")
    }

    override fun focusable() {
        println("[${javaClass.simpleName}] focus method call")
    }

    // 이와같이 다중 인터페이스에서 충돌을 위해 직접 명시하여 호출함.
    // 충돌이 없을땐 빌드오류가 없다.
    override fun printable() {
        super<Focus>.printable()
        super<Button>.printable()
    }
}

fun main(args : Array<String>){
    val waiver = Waiver()
    waiver.clickable()
    waiver.focusable()
    waiver.printable()
    //lina.cnt = 10 수정불가!!
}