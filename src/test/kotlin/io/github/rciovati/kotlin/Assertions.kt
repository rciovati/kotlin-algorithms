package io.github.rciovati.kotlin

import kotlin.test.fail

fun <T : Comparable<T>> assertArrayEquals(expected: Array<T>, actual: Array<T>): Unit {

    if (expected.size() != actual.size()) {
        fail("Expected size ${expected.size()} but found ${actual.size()}")
        return
    }

    for (i in actual.indices) {
        if (expected[i].compareTo(actual[i]) != 0) {
            fail("Expected ${expected[i]} but found ${actual[i]}")
        }
    }
}

fun <T : Comparable<T>> assertArrayIsSorted(actual: Array<T>) {
    for (i in 0..actual.size() - 2) {
        if (actual[i].compareTo(actual[i + 1]) > 0) {
            fail("${actual[i]} is greater than ${actual[i + 1]}")
        }
    }
}
