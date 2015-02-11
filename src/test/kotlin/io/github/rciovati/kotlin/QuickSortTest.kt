import org.junit.Test
import kotlin.test.assertEquals
import io.github.rciovati.kotlin.assertArrayIsSorted

public class QuickSortTest {

    Test fun mergeSortOddInput() {

        val array = array(1, 4, 2, 5, 3)

        quickSort(array)

        assertEquals(5, array.size())
        assertArrayIsSorted(array)
    }

    Test fun mergeSortEvenInput() {

        val array = array(1, 4, 2, 5)

        quickSort(array)

        assertEquals(4, array.size())
        assertArrayIsSorted(array)
    }
}
