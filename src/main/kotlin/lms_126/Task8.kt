package lms_126

fun task8(): String {

    return """
        FOR x is a number
        IF x multiple of 3
        OUTPUT "Foo"
        ELSE IF x multiple of 5
        OUTPUT "Bar"
        ELSE IF x multiple of both 3 and 5
        OUTPUT "FooBar"
        ELSE
        OUTPUT "Qix"
       
    """.trimIndent()
}
