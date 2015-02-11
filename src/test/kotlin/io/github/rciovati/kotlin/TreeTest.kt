import org.junit.Test
import kotlin.test.*
import io.github.rciovati.kotlin.assertArrayEquals

public class TreeTest {

    Test fun createTree() {
        val tree = Tree(1)
        assertEquals(1, tree.data)
        assertNull(tree.leftTree)
        assertNull(tree.rightTree)
    }


    Test fun testPrefixVisit() {
        val root = Tree(1)
        root.rightTree = Tree(3)
        root.leftTree = Tree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.prefix { array[i++] = it }

        assertArrayEquals(array(1, 2, 3), array)
    }

    Test fun testInfixVisit() {
        val root = Tree(1)
        root.rightTree = Tree(3)
        root.leftTree = Tree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.infix { array[i++] = it }

        assertArrayEquals(array(2, 1, 3), array)
    }

    Test fun testPostfixVisit() {
        val root = Tree(1)
        root.rightTree = Tree(3)
        root.leftTree = Tree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.postfix { array[i++] = it }

        assertArrayEquals(array(2, 3, 1), array)
    }
}

