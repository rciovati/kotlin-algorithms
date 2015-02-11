package io.github.rciovati.kotlin

fun <T> printArray(array: Array<T>) {
    val s = array.joinToString(separator = ", ", prefix = "Array: ")
    println(s)
}