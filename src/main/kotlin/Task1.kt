package com.selfcode.com.tasks


fun generateGreeting(name: String): String {
    // TODO(
        "Реалізуйте функцію generateGreeting — поверніть \"Hello, <name>!\"\n" +
                "Реализуйте функцию generateGreeting — верните \"Hello, <name>!\"\n" +
                "Implement the generateGreeting function — return \"Hello, <name>!\""
    // )
    // your code here
    return "Hello, $name!"


}

fun main() {
    val name = "Kotlin"
    println(generateGreeting(name))

}