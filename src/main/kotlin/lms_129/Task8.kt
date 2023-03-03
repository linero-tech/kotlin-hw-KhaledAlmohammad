package lms_129

fun task8(number: Int): Int {
    var result = 0
    var i = number
    while (i > 0){
        result += i % 10
        i /= 10
    }
    return result
}
fun main(){
    println(task8(66))
}
