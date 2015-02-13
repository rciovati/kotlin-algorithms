package io.github.rciovati.kotlin

fun <T> printArray(array: Array<T>, prefix: String = "Array: ") {
    val s = array.joinToString(separator = ", ", prefix = prefix)
    println(s)
}