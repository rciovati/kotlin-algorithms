import org.junit.Test
import kotlin.test.*
import io.github.rciovati.kotlin.assertArrayEquals

public class BinaryTreeTest {

    Test fun createTree() {
        val tree = BinaryTree(1)
        assertEquals(1, tree.data)
        assertNull(tree.leftTree)
        assertNull(tree.rightTree)
    }


    Test fun testPrefixVisit() {
        val root = BinaryTree(1)
        root.rightTree = BinaryTree(3)
        root.leftTree = BinaryTree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.prefix { array[i++] = it }

        assertArrayEquals(array(1, 2, 3), array)
    }

    Test fun testInfixVisit() {
        val root = BinaryTree(1)
        root.rightTree = BinaryTree(3)
        root.leftTree = BinaryTree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.infix { array[i++] = it }

        assertArrayEquals(array(2, 1, 3), array)
    }

    Test fun testPostfixVisit() {
        val root = BinaryTree(1)
        root.rightTree = BinaryTree(3)
        root.leftTree = BinaryTree(2)

        var array: Array<Int> = Array(3, { 0 })
        var i = 0;

        root.postfix { array[i++] = it }

        assertArrayEquals(array(2, 3, 1), array)
    }

    Test fun testVisitAtLevel() {

        val seven = BinaryTree(7)
        val six = BinaryTree(6)

        val five = BinaryTree(5)
        val four = BinaryTree(4)

        val three = BinaryTree(3)
        val two = BinaryTree(2)

        three.rightTree = seven
        three.leftTree = six

        two.rightTree = five
        two.leftTree = four

        val root = BinaryTree(1)
        root.rightTree = three
        root.leftTree = two

        var array: Array<Int> = Array(4, { 0 })
        var i = 0;

        root.visitNodesAtLevel({ array[i++] = it }, 2)

        assertArrayEquals(array(4, 5, 6, 7), array)
    }

    Test fun testHeight() {

        val seven = BinaryTree(7)
        val six = BinaryTree(6)

        val five = BinaryTree(5)
        val four = BinaryTree(4)

        val three = BinaryTree(3)
        val two = BinaryTree(2)

        three.rightTree = seven
        three.leftTree = six

        two.rightTree = five
        two.leftTree = four

        val root = BinaryTree(1)
        root.rightTree = three
        root.leftTree = two

        assertEquals(2, root.height())
    }
}

