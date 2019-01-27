fun main() {
    val times = 10
    var name = "Libby"
    greeting(name, times)
    val names = listOf("Libby", "Carlton")
    println(isEven(times))
    printNames(names)

    var harley = Dog("springer", "harley", "liver and white")
    harley.bark()

}

fun greeting(name: String, times: Int){
    for (x in 1..times){
        println("Hello, $name")
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun printNames(names: Collection<String>){
    for (name in names){
        println(name)
    }
}