public com.javapractice.leetcode.TreeNode convertBST(com.javapractice.leetcode.TreeNode root) {
    com.javapractice.leetcode.List<com.javapractice.leetcode.TreeNode> traverse = preorderTraverse(root);
    changeValue(traverse);
    return root;
}