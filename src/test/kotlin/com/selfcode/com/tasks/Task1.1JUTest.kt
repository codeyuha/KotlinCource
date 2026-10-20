package com.selfcode.com.tasks

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


class GenerateTextTest {

    @Test
    fun `generateText returns joined strings with hyphens`() {
        val result = generateText("Kotlin", "Java", "C#")
        assertEquals("Kotlin-Java-C#", result)
    }

    @Test
    fun `generateText works with single character strings`() {
        val result = generateText("A", "B", "C")
        assertEquals("A-B-C", result)
    }

    @Test
    fun `generateText works with empty strings`() {
        val result = generateText("", "", "")
        assertEquals("--", result)
    }

    @Test
    fun `generateText works with mixed empty strings`() {
        val result = generateText("Kotlin", "", "C#")
        assertEquals("Kotlin--C#", result)
    }

    @Test
    fun `generateText works with numbers as strings`() {
        val result = generateText("1", "2", "3")
        assertEquals("1-2-3", result)
    }

    @Test
    fun `generateText works with special characters`() {
        val result = generateText("@", "#", "$")
        assertEquals("@-#-$", result)
    }
}