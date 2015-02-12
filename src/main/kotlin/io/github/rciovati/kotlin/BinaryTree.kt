class BinaryTree<T>(val data: T) {

    var leftTree: BinaryTree<T>? = null
    var rightTree: BinaryTree<T>? = null

    fun prefix(visitor: (T) -> Unit) {
        visitor(data)
        leftTree?.prefix(visitor)
        rightTree?.prefix(visitor)
    }

    fun infix(visitor: (T) -> Unit) {
        leftTree?.prefix(visitor)
        visitor(data)
        rightTree?.prefix(visitor)
    }

    fun postfix(visitor: (T) -> Unit) {
        leftTree?.prefix(visitor)
        rightTree?.prefix(visitor)
        visitor(data)
    }

    fun visitNodesAtLevel(visitor: (T) -> Unit, targetLevel: Int, currentLevel: Int = 0) {
        if (currentLevel == targetLevel) {
            visitor(data)
        } else {
            leftTree?.visitNodesAtLevel(visitor, targetLevel, currentLevel + 1)
            rightTree?.visitNodesAtLevel(visitor, targetLevel, currentLevel + 1)
        }
    }
}