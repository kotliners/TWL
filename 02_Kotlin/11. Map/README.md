# Chapter 11. Map



## 맵에 대한 이터레이션

```kotlin
// 키에 대해 정렬하기 위해 TreeMap을 사용
val binaryRepes = TreeMap<Char, String>()
// A 부터 F까지 범위
for(c in 'A' .. 'F'){
  val binary = Integer.toBinaryString(c.toInt())
  binaryReps[c] = binary
}
// 맵에 대한 이터레이션
for((letter, binary) in binaryReps){
  println("$letter = $binary")
}
```

