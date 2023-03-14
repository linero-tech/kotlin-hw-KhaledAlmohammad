package lms_130

fun task1(items: List<Int>): Int {
    return if (items.isEmpty()){
        0
    }else
        items.random()
}
fun main(){
println(task1(listOf(1,4,5,7)))

}