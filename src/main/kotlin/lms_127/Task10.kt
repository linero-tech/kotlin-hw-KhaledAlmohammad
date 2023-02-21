package lms_127

fun task10_1(assessments: String): Int {
    return assessments.length
}

fun task10_2(assessments: String): Char {
    return assessments[3]
}

fun task10_3(assessments: String): Char {
    return assessments[assessments.length / 2]
}

fun task10_4(assessments: String): String {
    return assessments.substring(0, 3)
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