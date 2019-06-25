fun main() {
    firstMethod()
    secondMethod()
    thirdMethod()
    fourthMethod()
    fithMethod()
}

fun fithMethod() {
    val languages = listOf<String>("Java")
    //languages.add("Kotlin") unresolve reference to add method
}

fun fourthMethod() {
    val languages = mutableListOf("Java")
    languages.add("Kotlin")

    if (languages.isNotEmpty())
        languages.forEach { println(" foreach $it") }

    languages.removeAt(0)
    languages.removeAt(0)

    if (languages.isNotEmpty())
        println(languages[0])
    else
        println("Empty")
}

fun thirdMethod() {
    val string = "Hello val"
    println(string)
}

fun secondMethod() {
    var string = "hello"
    println(string)
}

fun firstMethod() {
    var string = 1
    //string = "abc" //mismatch
}
