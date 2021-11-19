private void preorderTraverse(Node node) {
    if (node == null) {
        return ;
    }
    addNodeToTraversalList(node);
    inorderTraverse(node.getLeft());
    inorderTraverse(node.getRight());
}