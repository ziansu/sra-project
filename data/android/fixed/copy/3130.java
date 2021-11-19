public void preOrderTraversal(Node n) {
    if (n == null) {
        return ;
    }
    java.lang.System.out.println(n.getData());
    preOrderTraversal(n.getLeftChild());
    preOrderTraversal(n.getRightChild());
}