public void postOrderTraverse(DataStructuresClasses.BinarySearchTree.BinaryTreeNode node) {
    if (node != null) {
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        java.lang.System.out.print(((node.data) + " "));
    }
}