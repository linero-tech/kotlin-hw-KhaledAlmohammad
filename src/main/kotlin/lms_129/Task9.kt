package lms_129

fun task9(temperature: String): String {
    val input = temperature.last().uppercase()
    val value = temperature.substring(0,temperature.length-1).toDouble()
    val result= if (input == "C"){
        (value * 9 / 5 + 32).toInt().toString()+"F"
    }else {
        ((value -32) * 5 / 9).toInt().toString()+ "C"
    }
    return result
}
fun main(){
    println(task9("-30c"))
}
