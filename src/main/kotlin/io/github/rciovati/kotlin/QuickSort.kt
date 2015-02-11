fun quickSort(array: Array<Int>, from: Int = 0, to: Int = array.size() - 1) {

    if (from < to) {
        val q = partition(array, from, to)
        quickSort(array, from, q - 1)
        quickSort(array, q + 1, to)
    }
}

fun partition(array: Array<Int>, left: Int, right: Int): Int {

    val pivot = array[right];
    var i = left - 1;

    for (j in left..right - 1) {
        if (array[j] <= pivot) {
            i++;
            array.swap(i, j)
        }
    }

    array.swap(i + 1, right)

    return i + 1;
}

fun <T> Array<T>.swap(i: Int, j: Int) {
    val t = this[i];
    this[i] = this[j];
    this[j] = t;
}