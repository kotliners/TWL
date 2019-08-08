
//  추상 클래스
abstract class Avengers{
    // 재정의용
    abstract fun reloadWork()

    // 공통 메소드
    fun justDoIt(){
        println("Just Do It")
    }
}

class WaiverSurf : Avengers() {
    override fun reloadWork() {
        println("I am a Man")
    }
}
