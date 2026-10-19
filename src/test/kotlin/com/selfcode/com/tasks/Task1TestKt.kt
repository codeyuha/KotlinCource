package com.selfcode.com.tasks


import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for the `generateGreeting` function in the `Main1Kt` class.
 *
 * This function takes a `name` as input and returns a personalized greeting.
 */
class Task1KtTest {

    @Test
    fun `should return greeting for a single name`() {
        // Arrange
        val name = "Alice"

        // Act
        val result = generateGreeting(name)

        // Assert
        assertEquals("Hello, Alice!", result)
    }

    @Test
    fun `should return greeting with an empty name as input`() {
        // Arrange
        val name = ""

        // Act
        val result = generateGreeting(name)

        // Assert
        assertEquals("Hello, !", result)
    }

    @Test
    fun `should return greeting for a name with spaces`() {
        // Arrange
        val name = "John Doe"

        // Act
        val result = generateGreeting(name)

        // Assert
        assertEquals("Hello, John Doe!", result)
    }

    @Test
    fun `should return greeting for a name with special characters`() {
        // Arrange
        val name = "@#\$%^&*"

        // Act
        val result = generateGreeting(name)

        // Assert
        assertEquals("Hello, @#\$%^&*!", result)
    }
}