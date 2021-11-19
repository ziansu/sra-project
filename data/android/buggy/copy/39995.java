private void postOrder(BSTNode current) {
    if (current == null)
        return ;
    
    inOrder(current.getLeft());
    inOrder(current.getRight());
    java.lang.System.out.print(((current.getKey()) + " "));
}