// 1. 일반 클래스
class Customer2 {
    var name : String? = null
    var age : Int? = null

    // 1개 인자 받아서, 2개 생성자 호출
    constructor(name : String) : this(name, 0){
        this.name = name
    }

    // 2개 인자 받아서 각각 설정
    constructor(name : String, age : Int){
        this.name = name
        this.age = age
    }

    constructor() {
        println("NoArgs 생성자")
    }
}

// 2. data class 생성자
// 자동으로 데이터에 필요한 메소드 생성해준다.
// 각각의 생성자들을 만들어준다.
// 추상화나 씰드 불가
data class User4(val nickName : String, val isSuccess : Boolean = true)

// 3. 접근 불가 생성자
class PrivateClass private constructor(){}