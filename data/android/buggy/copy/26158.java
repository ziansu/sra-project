private void disconnectNodes(BooleanTree.Node parent, BooleanTree.Node child) {
    child.parents.remove(parent);
    parent.children.remove(child);
}