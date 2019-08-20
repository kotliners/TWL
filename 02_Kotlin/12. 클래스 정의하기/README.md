# Chapter 12. 클래스 정의하기



```Kotlin
class Person(
  // 읽기 전용 프로퍼티, private 필드와 public getter 메서드를 생성
	val name : String,
  // 쓸수 있는 프로퍼티, private 필드와 public getter setter 메서드를 생성
	var isMarried : Boolean
)
```

```kotlin
// 자바와 다른점 new 키워드를 사용하지 않고 생성자를 호출
>>> val person = Person("Bob", true)

// 프로퍼티 이름을 직접 사용해도 자동 게터를 호출
>>> println(person.name)
Bob
>>> println(person.isMarried)
true
```



## 커스텀 접근자

```kotlin
class Rectangle(val height: Int, val width: Int){
	val isSquare : Boolean
		get() {
			return height == width
		}
	// get() = height == width 로 대체할 수 있다.
}
```

```kotlin
>>> val rectangle = Rectangle(41, 43)
>>> println(rectangle.isSquare)
false
```



## enum 클래스 다루기

```kotlin
enum class Color(
  // 상수 프로퍼티를 정의
	val r : Int, val g : Int, val b : Int
){
  // 각 상수를 생성할 때 그에 대한 프로퍼티 값을 저장
	RED(255, 0, 0), ORANGE(255, 165, 0),
	YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
	INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 반드시 ; 사용

  // enum 클래스 안에서 메서드 정의
	fun rgb() = (r * 256 + g) * 256 + b
}
```

```kotlin
>>> println(Color.BLUE.rgb())
255
```

