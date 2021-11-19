@java.lang.Override
protected com.mattunderscore.trees.binary.ClosedBinaryTreeNode<E> convert(com.mattunderscore.trees.binary.ClosedMutableBinaryTreeNode<E> node) {
    return new com.mattunderscore.trees.binary.search.WrappedBinaryNode(node);
}