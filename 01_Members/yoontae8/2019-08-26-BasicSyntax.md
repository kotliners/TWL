BasicSyntax
===
https://kotlinlang.org/docs/reference/basic-syntax.html

# 프로그램 시작점
코틀린 앱의 시작점은 main 함수
<pre><code>
fun main() {
    println("Hello world!")
}
</code></pre>

# 함수
파라미터 타입과 리턴 타입은 다음과 같이 표시한다.
<pre><code>
fun sum(a: Int, b: Int): Int {
    return a + b
}
</code></pre>
표현식으로 나타낼 수 있다.
fun sum(a: Int, b: Int) = a + b

# 변수
읽기 전용(자바에서 final) 변수는 val 키워드로 선언한다.
<pre><code>
val a: Int = 1
val b = 2
재할당 가능한 변수는 var 키워드를 사용
</code></pre>
<pre><code>
var x = 5
x += 1
</code></pre>

# 문자열 템플릿
<pre><code>
var a = 1
val s1 = "a is $a"
a = 2
val s2 = "${s1.replace("is", "was")}, but now is $a"
</code></pre>

# 조건문
<pre><code>
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
</code></pre>
표현식으로
<pre><code>
fun maxOf(a: Int, b: Int) = if (a > b) a else b
</code></pre>

# null이 될 수 있는 값과 null 체크
참조가 null이 될 수 있을 경우 명시적으로 표시해 주어야 한다.
<pre><code>
fun parseInt(str: String): Int? {
    // ...
}
</code></pre>
null이 될 수 있는 값을 사용하는 함수
<pre><code>
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // x, y가 null값일 수 있기 때문에 x * y는 에러를 발생시킨다.
    if (x != null && y!= null) {
        // null 체크로 인해 null이 될 수 없도록 캐스팅된다.
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}
</code></pre>

# 타입 검사와 자동 형변환
'is' 연산자를 사용해서 표현식이 특정 타입의 객체인지 확인할 수 있다. 변경할 수 없는 지역변수나 속성을 확인 시 해당 타입으로 자동 형변환된다.
<pre><code>
fun getStringLength(obj: Any): Int? {
    // && 앞의 연산에서 String으로 형변환됨
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}
</code></pre>

# for
<pre><code>
val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
    println(item)
}
</code></pre> 
혹은
<pre><code>
val items = listOf("apple", "banana", "kiwifruit")
for (index in items.indices) {
    println("item at $index is ${items[index]})
</code></pre> 

# while
<pre><code>
val items = listOf("apple", "banana", "kiwifruit")
var index = 0
while (index < items.size) {
    println("item at $index is ${item[index]})
}
</code></pre> 

# when
<pre><code>
fun describe(obj: Any): String = 
    when (obj) {
        1           -> "One"
        "Hello"     -> "Greeting"
        is Long     -> "Long"
        !is String  -> "Not a string"
        else        -> "Unknown"
    }
</code></pre> 

# Ranges
'in'을 사용하여 숫자가 범위 내에 있는지 확인 가능하다.
<pre><code>
val x = 10
val y = 9
if (x in 1..y+1) {
    println("fits in range")
}
</code></pre> 
범위를 벗어났는지 확인
<pre><code>
val list = listOf("a", "b", "c")

if (-1 !in 0..list.lastIndex) {
    println("-1 is out of range)
}
if (list.size !in list.indices) {
    println("list size is out of valid list indices range")
}
</code></pre> 
범위 순회
<pre><code>
for (x in 1..10 stp 2) {
    print(x)
}
println()
for (x in 9 downTo 0 step 3) {
    print(x)
}
</code></pre> 

# Collections
컬렉션 순회
<pre><code>
for (item in items) {
    println(item)
}
</code></pre> 
컬렉션 원소 확인
<pre><code>
when {
    "orange" in items -> println("juicy")
    "apple" in items -> println("apple is fine too")
}
</code></pre> 
람다 표현식으로 filter, map
<pre><code>
val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
fruits
    .filter { it.startsWith("a")}
    .sortedBy { it }
    .map { it.toUpperCase() }
    .forEach { println(it) }
</code></pre> 

# 클래스와 인스턴스 만들기
<pre><code>
val rectangle = Rectangle(5.0, 2.0) // new 키워드 사용하지 않음
val triangle = Triangle(3.0, 4.0, 5.0)
</code></pre> 