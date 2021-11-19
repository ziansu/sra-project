private void traverse(codebook.datastructures.AVLTree.Node n) {
    if (n == null)
        return ;
    
    traverse(n.left);
    java.lang.System.out.println(n.key);
    traverse(n.right);
}