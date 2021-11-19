public void printTree(int s) {
    DiGraph.TreeNode root = buildTree((s - 1));
    recurPrint(root, 1);
}