package lms_126

fun task10(): String {

    return """
        INPUT "create password"
        Test the user's password against the six characters long.
        store the password
        IF the password does not match the rule of the six characters long.
        OUTPUT "Invalid password, the password have to include six character long"
        ELSE
        OUTPUT " The account created successfully"
    """.trimIndent()
}
