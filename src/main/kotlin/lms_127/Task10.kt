package lms_127

fun task10_1(assessments: String): Int {
    val result = assessments.length
    return result
}

fun task10_2(assessments: String): Char {
    val result = assessments.get(3)
    return result
}

fun task10_3(assessments: String): Char {
val result = assessments.get(assessments.length / 2)
    return result
}

fun task10_4(assessments: String): String {
    val result = assessments.substring(0, 3)
    return result
}
fun main() {


    val answer10_1 = task10_1("LMHHF")
    println("result is $answer10_1")

    val answer10_2 = task10_2("LMFHMF")
    println("result is $answer10_2")

    val answer10_3 = task10_3("LMFHM")
    println("result is $answer10_3")


    val answer10_4 = task10_4("LMFHM")
    println("result is $answer10_4")



}