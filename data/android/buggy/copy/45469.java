public T findMax() {
    if (com._4.bst.BinarySearchTree.isEmpty()) {
        throw new java.nio.BufferUnderflowException();
    }
    return findMax(root).element;
}