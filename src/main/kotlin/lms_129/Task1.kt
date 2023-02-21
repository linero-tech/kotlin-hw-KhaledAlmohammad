package lms_129

fun task1(a: Int, b: Int): Int {
    var result= 0
    for( i in a .. b){
        if (a >= b)
            println("$result")
        else {
            result += i
        }

    }
    return result

}
fun main(){
    val answer = task1(a = 1, b = 5)
    println("result is $answer")
}
