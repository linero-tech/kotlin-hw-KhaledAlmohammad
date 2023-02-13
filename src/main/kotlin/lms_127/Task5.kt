package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB
    a  = valueForB
    b = valueForA



    // Do not erase or change this statement
    return Pair(a, b)
}
fun main() {
    val pairAfterSwap = task5(2, 1)
    println("$pairAfterSwap")
    val pair = task5(1, 2)
    println("$pair")

}
