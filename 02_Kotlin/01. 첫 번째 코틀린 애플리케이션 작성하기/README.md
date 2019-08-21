# Chapter 01. 첫 번째 코틀린 애플리케이션 작성하기

## Hello, World!

```kotlin
fun main(args: Array<String>){
  println("Hello, world!")
}
```

## 코틀린 빌드 과정

<img src="../images/chapter01/build_kotlin.png" width="80%" height="80%">

```bash
# kotlinc 명령을 통해 코드 컴파일
kotlinc <소스파일 또는 디렉터리> -include-runtime -d <jar 이름>
# java 명령으로 코드 실행
java -jar <jar이름>
```



## 코틀린의 예외 처리

```kotlin
fun readNumber(reader: BufferedReader){
  val number = try{
    // 예외가 발생하지 않으면 이 값을 number에
    Integer.parseInt(reader.readLine())
  }catch(e : NumberFormatException){
    // 예외가 발생하면 null 값을 number에
    null
  }
}
```

```bash
>>> val reader = BufferedReader(StringReader("not a number"))
>>> readNumber(reader)
null
```

