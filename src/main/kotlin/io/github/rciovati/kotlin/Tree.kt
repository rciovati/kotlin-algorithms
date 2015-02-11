class Tree<T>(val data: T) {
    var leftTree: Tree<T>? = null
    var rightTree: Tree<T>? = null
}

fun <T> Tree<T>.prefix(visitor: (T) -> Unit) {
    visitor(data)
    this.leftTree?.prefix(visitor)
    this.rightTree?.prefix(visitor)
}

fun <T> Tree<T>.infix(visitor: (T) -> Unit) {
    this.leftTree?.prefix(visitor)
    visitor(data)
    this.rightTree?.prefix(visitor)
}

fun <T> Tree<T>.postfix(visitor: (T) -> Unit) {
    this.leftTree?.prefix(visitor)
    this.rightTree?.prefix(visitor)
    visitor(data)
}