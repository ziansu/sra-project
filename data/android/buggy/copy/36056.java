public void postOrderTraverse(datastructure.nonlinear.BinaryTreeNode rootNode) {
    if (rootNode == null) {
        return ;
    }
    preOrderTraverse(rootNode.leftChild);
    preOrderTraverse(rootNode.rightChild);
    java.lang.System.out.println(rootNode.data);
}