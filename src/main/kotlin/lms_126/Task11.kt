package lms_126

fun task11(): String {

    return """
        INPUT the temperature 
        IF the input contain C
        Convert to Fahrenheit by use the calculation F= 9/5 * C + 32
        OUTPUT F
        ELSE, IF the input contain F
        Convert to Celsius by use the calculation C=(F-32)*5/9
        OUTPUT C
    """.trimIndent()
}
