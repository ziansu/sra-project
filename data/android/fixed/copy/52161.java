public javax.swing.tree.DefaultMutableTreeNode getTree() {
    for (praxigen.jsonGenerator.myNodes.nodes object : nodesList) {
        this.add(object.getTree());
    }
    return this;
}