package com.selfcode.com.tasks


import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for the generateText function in the Task1_1Kt class.
 * The generateText function takes three strings as input and returns a concatenated string in the format: "text1-text2-text3".
 */
class Task1_1KtTest {

    @Test
    fun `test generateText with standard input`() {
        // Arrange
        val text1 = "Kotlin"
        val text2 = "Java"
        val text3 = "C#"

        // Act
        val result = generateText(text1, text2, text3)

        // Assert
        assertEquals("Kotlin-Java-C#", result)
    }

    @Test
    fun `test generateText with empty strings`() {
        // Arrange
        val text1 = ""
        val text2 = ""
        val text3 = ""

        // Act
        val result = generateText(text1, text2, text3)

        // Assert
        assertEquals("--", result)
    }

    @Test
    fun `test generateText with special characters`() {
        // Arrange
        val text1 = "Hello"
        val text2 = "@World"
        val text3 = "#Kotlin"

        // Act
        val result = generateText(text1, text2, text3)

        // Assert
        assertEquals("Hello-@World-#Kotlin", result)
    }

    @Test
    fun `test generateText with numeric strings`() {
        // Arrange
        val text1 = "123"
        val text2 = "456"
        val text3 = "789"

        // Act
        val result = generateText(text1, text2, text3)

        // Assert
        assertEquals("123-456-789", result)
    }

    @Test
    fun `test generateText with mix of upper and lower case`() {
        // Arrange
        val text1 = "abc"
        val text2 = "DEF"
        val text3 = "Ghi"

        // Act
        val result = generateText(text1, text2, text3)

        // Assert
        assertEquals("abc-DEF-Ghi", result)
    }
}