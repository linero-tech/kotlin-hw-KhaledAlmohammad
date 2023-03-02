package lms_129

fun task6(number: Int): Int {

    var result = 0
    number % 10 != 0
  for (i in 0 .. number){

      result = number.toString().reversed().toInt()
  }

    return result
}
fun main(){
    println(task6(678))
}
