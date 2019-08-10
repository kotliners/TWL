import java.lang.IllegalArgumentException
import java.util.*

fun main(args : Array<String>){

    when (Random().nextLong().toChar()) {
        in '0'..'9' -> "is digit"
        in 'a'..'z', in 'A'..'Z' -> "is character"
        else -> throw IllegalArgumentException()
    }

    // NoParameter
    val result = when{
        true -> "TRUE"
        false -> "FALSE"
        else -> throw NullPointerException()
    }

}

// is Char
fun isLetter(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'

// is Not Digit
fun isNotDigit(c: Char) = c !in '0' .. '9'