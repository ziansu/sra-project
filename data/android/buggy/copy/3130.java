public void preOrderTraversal(Node n) {
    if (n == null) {
        return ;
    }
    java.lang.System.out.println(n.getData());
    inOrderTraversal(n.getLeftChild());
    inOrderTraversal(n.getRightChild());
}