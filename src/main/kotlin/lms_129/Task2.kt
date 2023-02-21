package lms_129

fun task2(number: Int): Boolean {
    val result = number > 1 && number < 100
    return result
}
fun main(){
    val answer = task2(5)
    println("$answer")
}
