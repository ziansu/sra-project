public TreeNode<T> doubleRotateRightLeft(TreeNode<T> k3) {
    singleRotateLeft(k3.rson);
    return singleRotateRight(k3);
}