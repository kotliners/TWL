// 상속을 위해 open 공개
open class Parent{
    open fun echo() : String = "I am Parent"
}


class Child : Parent() {
    // 오버라이드는 부모가 open 형태어야 가능
   override fun echo() : String = "I am Child"
}

fun main(args : Array<String>){
    val child = Child()
    println(child.echo())
    val parent = Parent()
    println(parent.echo())
}