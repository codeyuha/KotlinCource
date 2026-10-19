plugins {
    kotlin("jvm") version "2.3.10"
}

group = "com.selfcode.com.tasks"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))   // Junit5
}

kotlin {
    jvmToolchain(22)
}

tasks.test {
    useJUnitPlatform()
}