
package com.example.kotlin_native_sample

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "kotlin Rocks on ${platformName()}"
}