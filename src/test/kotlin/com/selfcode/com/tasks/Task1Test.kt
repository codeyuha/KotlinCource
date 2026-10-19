package com.selfcode.com.tasks

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName

class MainTest {

    @Test
    @DisplayName("Test greeting for Kotlin")
    fun testGenerateGreeting() {
        val result = generateGreeting("Kotlin")
        assertEquals("Hello, Kotlin!", result)
    }

    @Test
    @DisplayName("Test greeting with a different name")
    fun testGenerateGreetingWithDifferentName() {
        val result = generateGreeting("Student")
        assertEquals("Hello, Student!", result)
    }
}