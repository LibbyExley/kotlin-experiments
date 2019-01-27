fun main(){
    fizzbuzz()
    var numbers = listOf(1, 3, 5, 7, 9, 11, 13, 15)
    fizzbuzz(numbers)
}

fun fizzbuzz(){
    for (number in 1..100){
        evaluateNumber(number)
    }
}

fun fizzbuzz(listOfNumbers : Collection<Int>){
    for (number in listOfNumbers){
        evaluateNumber(number)
    }
}

fun evaluateNumber(number: Int) {
    if (number % 5 == 0 && number % 3 == 0) println("FizzBuzz")
    else if (number % 3 == 0) println("Fizz")
    else if (number % 5 == 0) println("Buzz")
    else println(number)
}
