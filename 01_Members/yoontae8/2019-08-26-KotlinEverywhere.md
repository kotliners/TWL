Kotlin/Everywhere
===

# What’s new in Kotlin? - Svetlana Isakova

## Kotlin 1.0 이후의 변화
1.1: coroutines
1.2: multi-platform projects

코틀린에 미래에 추가하게 될 실험적 요소들

https://github.com/Kotlin/KEEP
Kotlin Evolution and Enhancement Process

mark Class/Function as experimental - @Experimental
use experimental api - @UseExperimental(class)

## Inline classes
ex. Duration API
함수 선언시 파라미터의 단위를 실수하기 쉽다. millis? second?
다중정의로 이름을 달리할 수 있지만 번거로움
파라미터를 클래스로 전달 -> 불필요 object가 할당됨
=> 인라인 클래스를 정의하여 bytecode 단계에서 primitive로 변환되도록 한다.
- 제약: 하나의  immutable 프로퍼티만 정의 가능
API를 사용 편리하게 하고 메모리는 절약할 수 있음


## Contract
추가 정보를 컴파일러에 전달해서 컴파일시 참고, 에러 발생하지 않도록
암묵적으로 적용할 경우 변경시 대응 힘듬
명시적으로 적용하여 수정시 대응할 수 있도록
ex. run -> 한번만 작동할 것
ex. isEmptyOrNull -> null 값으로 인해 에러를 발생시키지 않을 것

## Immutable Collection
two list in kotlin - List(read-only), MutableList
Read-only와 immutable은 같지 않다
list가 mutableList 를 함께 가리키면, list를 통해서는 수정이 불가능하지만 mutableList로는 가능함
read-only여도 안의 내용은 변경될 수도 있다.
Immutable한 리스트를 추가, 다른 참조로 변경될 수 없도록
ImmutableList: 
PersistentList: 수정을 반영한, 기존 리스트와 데이타를 부분 공유하는 새로운 리스트를 반환
list.builder().apply {
 add(3)
 add(4)
}
-> 여러 operation 적용

## Flows
두 개중 어떤 것을 써야 하는가
- natural flow of event/data/stream -> reactive stream is better
- 다른 경우: coroutine.. 이었는데
Flow: suspend-based reactive stream
reactive stream을 지원하는 코루틴

## Multi-platform Projects
같은 코드로 Server/Client, Android/iOS에서 동작하도록
kotlin native? kotlin js?
부분공유 - 비즈니스로직을 공유/UI를 분리 등등

expect 로 common code를 정의
actual 로 다른 부분을 각자 구현

coursera - Kotlin for Java Developers
http://kotl.in/hands-on : coroutine hands on lab