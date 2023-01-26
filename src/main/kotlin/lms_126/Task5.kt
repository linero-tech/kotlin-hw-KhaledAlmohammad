package lms_126

fun task5(): String {

    return """
        num = int(input("Please type in a number:"))
        number_list = [i+1 for i in range(num)]

        while number_list:
            print(number_list.pop(0))
            number_list.reverse()



    """
}
