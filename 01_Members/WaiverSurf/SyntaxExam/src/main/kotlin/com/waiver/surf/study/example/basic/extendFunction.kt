// prefix로 붙은 클래스가 확장해서 재정의하는 개념이다.
// = 안에서는 앞에 붙은 확장 클래스의 오브젝트로 이어진다.
// 효과는 실제 String안에 포함된것처럼 체감하게된다.
// 캡슐화되있는 영역에 영향을 미치진 않는다 독립적이다.
fun String.lastChar() : Char = this.get(this.length - 1)
//fun String.lastChar() : Char = get(length - 1)


// 상수 : 확장 프로퍼티는 해당 클래스안에 프로퍼티 타입으로 주입시키는것
val String.lastChar : Char get() = get(length - 1)

// 변수 : 확장 프로퍼티
var StringBuilder.lastChar : Char
    get() = get(length-1)
    set(value: Char) {
        setCharAt(length-1, value)
    }

fun main(args : Array<String>){
    println("abc".lastChar())
    println("asdf".lastChar)

}