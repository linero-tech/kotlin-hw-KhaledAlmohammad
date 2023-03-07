package lms_129


fun task10(password: String): Boolean {

val result = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$#@]{6,10}\$)".toRegex()

    return result.matches(password)
}
fun main(){
    println(task10("Test@2pass"))
}