private static RBTree.RBNode getMinimum(RBTree.RBNode node) {
    if (node == null) {
        return null;
    }
    while ((node.left) != null) {
        node = node.left;
    } 
    return node;
}