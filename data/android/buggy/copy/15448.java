private static int getDepth(BinaryTreeParent<java.lang.Integer> node) {
    int depth = 0;
    while ((node.parent) != null) {
        ++depth;
        node = node.parent;
    } 
}