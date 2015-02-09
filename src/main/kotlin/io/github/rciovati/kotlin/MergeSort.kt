fun mergeSort(array: Array<Int>): Array<Int> {

    return performMergeSort(array, 0, array.size() - 1)
}

fun performMergeSort(array: Array<Int>, left: Int, right: Int): Array<Int> {

    if (left < right) {
        val center = (right + left) / 2
        val first = performMergeSort(array, left, center)
        val second = performMergeSort(array, center + 1, right)
        return merge(first, second)
    }

    return array(array[left])
}

fun merge(first: Array<Int>, second: Array<Int>): Array<Int> {

    val result: Array<Int> = Array(first.size() + second.size(), { 0 })

    var i = 0
    var j = 0
    var k = 0

    while (i < first.size() && j < second.size()) {
        if (first[i] < second[j]) {
            result[k++] = first[i++]
        } else {
            result[k++] = second[j++]
        }
    }

    if (i < first.size()) {
        while (i < first.size()) {
            result[k++] = first[i++]
        }
    } else {
        while (j < second.size()) {
            result[k++] = second[j++]
        }
    }

    return result
}