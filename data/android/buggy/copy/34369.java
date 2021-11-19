private void inOrder(collection.tree.ExpresionTree.NodeExpression node, java.lang.StringBuilder infix) {
    if (node != null) {
        inOrder(node.nodeLeft, infix);
        infix.append(node);
        infix.append(" ");
        inOrder(node.nodeRight, infix);
    }
}