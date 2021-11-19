public void expandRoot() {
    expandPath(new javax.swing.tree.TreePath(new java.lang.Object[]{ getRootNode() }));
    if (!(getRootNode().isInitialized())) {
        getRootNode().init();
    }
}