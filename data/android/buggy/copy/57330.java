private int findMinimalNode(com.goit.g2popov.module05.task02.TreeNode root) {
    while ((root.left) == null) {
        root = root.left;
    } 
    return root.value;
}