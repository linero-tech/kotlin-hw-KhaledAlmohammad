package lms_129


fun task10(password: String): Boolean {

//val result = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$#@]{6,10}\$)".toRegex()
    //result.matches(password)
    if (password.length < 6 || password.length > 10){
        return false

    }
    var includeNumber = false
    var includeLowCase = false
    var includeUpperCase = false
    var includeSpecial = false

    for (i in password){
        if (i.isLowerCase()){
            includeLowCase = true
        } else if (i.isDigit()){
            includeNumber = true
        }else if (i.isUpperCase()){
            includeUpperCase = true
        } else if (!i.isLetterOrDigit()){
            includeSpecial =true
        }
    }

    return includeLowCase && includeUpperCase && includeNumber && includeSpecial
}
fun main(){
    println(task10("Test@2pass"))
}