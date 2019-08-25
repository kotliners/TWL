# Chapter 04. 함수

## Kotlin function define

```kotlin
fun max(a : Int, b : Int) : Int {
  return if (a > b) a else b
}
```

- `max` : 함수 이름
- `(a : Int, b : Int)` : 파라미터 목록
- `: Int` :  반환 타입
- `return if (a > b) a else b` : 함수 본문



## 메서드를 다른 클래스에 추가 : 확장 함수와 확장 프로퍼티

```kotlin
package strings
fun String.lastChar() : Char : this.get(this.length - 1)
// 수신 객체 멤버에 this 없이 접근 가능
fun String.lastChar() : Char : get(length - 1)
```

fun String.lastChar() 의 `String` : 수신 객체 타입

this.get(this.length - 1) 의 `this`, `this` : 수신 객체

```kotlin
>>> println("Kotlin".lastChar())
n
```

