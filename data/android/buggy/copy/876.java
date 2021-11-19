private static int height(leetcode.Problem662.TreeNode node) {
    if (node == null) {
        return 0;
    }
    return (java.lang.Math.max(leetcode.Problem662.height(node.left), leetcode.Problem662.height(node.right))) + 1;
}