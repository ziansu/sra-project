public void preOrderTraverse(DataStructuresClasses.BinarySearchTree.BinaryTreeNode node) {
    java.lang.System.out.print(((node.data) + " "));
    preOrderTraverse(node.left);
    preOrderTraverse(node.right);
}