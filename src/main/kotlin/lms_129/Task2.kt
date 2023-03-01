package lms_129

fun task2(number: Int): Boolean {
    var result = true
    for(i in 2..number/2) {
        if (number % i ==0){
            result = false
        }
    }
    return result
}
fun main() = println(task2(5))