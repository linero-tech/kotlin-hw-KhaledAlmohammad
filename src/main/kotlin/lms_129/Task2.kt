package lms_129

fun task2(number: Int): Boolean {
    val result = number > 1 && number % number ==0 && number % 1 == 0 && number % 2 != 0
    return result
}
fun main(){
    val answer = task2(4)
    println("$answer")
}
