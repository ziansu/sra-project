public int largestBSTSubtree(TreeNode root) {
    LargestBSTSubtree.ResNode resNode = helper(root);
    return resNode.count;
}