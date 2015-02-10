import org.junit.Test
import junit.framework.TestCase
import kotlin.test.*
import org.junit.After
import org.junit.Before
import java.io.FileInputStream
import java.io.File
import io.github.rciovati.kotlin.assertArrayEquals
import io.github.rciovati.kotlin.assertArrayIsSorted

public class MergeSortTest {

    Test fun mergeSameLength() {

        val result = merge(array(1, 3, 5), array(2, 6, 7))
        val expected = array(1, 2, 3, 5, 6, 7)

        assertArrayEquals(expected, result)
    }

    Test fun mergeDifferentLength() {

        val result = merge(array(1, 3, 5, 8), array(1, 2, 6, 7, 9))
        val expected = array(1, 1, 2, 3, 5, 6, 7, 8, 9)

        assertArrayEquals(expected, result)
    }

    Test fun mergeDifferentLength2() {

        val result = merge(array(1, 3, 5, 8), array(2))
        val expected = array(1, 2, 3, 5, 8)

        assertArrayEquals(expected, result)
    }

    Test fun mergeSortOddInput() {

        val array = mergeSort(array(1, 4, 2, 5, 3))

        assertEquals(5, array.size())
        assertArrayIsSorted(array)
    }

    Test fun mergeSortEvenInput() {

        val array = mergeSort(array(1, 4, 2, 5))

        assertEquals(4, array.size())
        assertArrayIsSorted(array)
    }
}