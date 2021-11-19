private void printBinaryTree(BinaryTreeNode<K, V> p) {
    if (p == null) {
        return ;
    }
    printBinaryTree(p.left);
    java.lang.System.out.println(p.value);
    printBinaryTree(p.right);
}