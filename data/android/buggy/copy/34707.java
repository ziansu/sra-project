public void addStandardTree(tree.Node parent, int depth) {
    java.lang.System.out.println(("creating tree with depth " + depth));
    tree.Node newNode = new tree.Node(parent);
    addTree(newNode, (depth - 1));
}