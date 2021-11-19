public void postOrderTraversal(Node n) {
    if (n == null) {
        return ;
    }
    postOrderTraversal(n.getLeftChild());
    postOrderTraversal(n.getRightChild());
    java.lang.System.out.println(n.getData());
}