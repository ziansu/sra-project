public void add(E d) {
    TreeNode<E> bn = new TreeNode(d);
    if ((root) == null) {
        root = bn;
    }else {
        add(root, bn);
    }
}