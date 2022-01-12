public int largestBSTSubtree(TreeNode root) {
    if (root == null) {
        return 0;
    }
    LargestBSTSubtree.ResNode resNode = helper(root);
    return resNode.count;
}