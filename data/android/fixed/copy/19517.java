@org.junit.Test
public void shouldCountNodesInBinaryTree() {
    cs.study.TreeNode root = createBinaryTree();
    assertTrue("should count nodes in binary tree", (5 == (cs.study.TreeNode.size(root))));
}