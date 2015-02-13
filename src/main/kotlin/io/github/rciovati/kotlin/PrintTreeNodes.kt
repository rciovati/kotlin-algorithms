import java.util.HashSet
import java.util.ArrayList

fun <T> buildNodesList(tree: BinaryTree<T>, array: MutableList<MutableSet<T>>, currentLevel: Int = 0): Unit {

    if (array.size() <= currentLevel) {
        array.add(HashSet())
    }

    array.get(currentLevel).add(tree.data)

    val left = tree.leftTree
    val right = tree.rightTree

    if (left != null) {
        buildNodesList(left, array, currentLevel + 1)
    }

    if (right != null) {
        buildNodesList(right, array, currentLevel + 1)
    }
}

fun main(args: Array<String>) {

    val tree = buildSampleTree()

    val list = ArrayList<MutableSet<String>>()

    buildNodesList(tree, list)

    list.forEachIndexed {(levels, nodes) ->
        val s = nodes.joinToString(separator = ", ")
        println("$levels -> $s")
    }
}

fun buildSampleTree(): BinaryTree<String> {

    val b = BinaryTree("B")
    val c = BinaryTree("C")

    b.rightTree = BinaryTree("D")

    c.rightTree = BinaryTree("F")
    c.leftTree = BinaryTree("E")

    val a = BinaryTree("A")
    a.rightTree = b
    a.leftTree = c

    return a
}