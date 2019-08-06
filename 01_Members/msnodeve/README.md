# Kotlin Basic

**2019.08.06** Study

## Hello, World!

```kotlin
fun main(args: Array<String>){
  println("Hello, world!")
}
```



## Kotlin function define

```kotlin
fun max(a : Int, b : Int) : Int {
  return if (a > b) a else b
}
```

- max` : 함수 이름
- `(a : Int, b : Int)` : 파라미터 목록
- `: Int` :  반환 타입
- `return if (a > b) a else b` : 함수 본문
