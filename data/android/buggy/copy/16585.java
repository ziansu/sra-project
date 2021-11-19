public RedBlackTree.Node TreeSuccessor(RedBlackTree.Node node) {
    return ceilingNode(((node.key) + 1));
}