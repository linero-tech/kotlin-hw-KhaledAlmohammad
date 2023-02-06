package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {
    val result = 0.5 * ( base1 + base2) / height
    return result
}
fun main() {
    val answer = task6(base1 = 10.0, base2 = 20.0, height = 1.0)
    println(answer)
}
