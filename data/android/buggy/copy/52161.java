public javax.swing.tree.DefaultMutableTreeNode getTree() {
    javax.swing.tree.DefaultMutableTreeNode top = new javax.swing.tree.DefaultMutableTreeNode("Nodes");
    for (praxigen.jsonGenerator.myNodes.nodes object : nodesList) {
        top.add(object.getTree());
    }
    return top;
}