public void setChild(final int childIndex, final beast.evolution.tree.Node node) {
    while ((children.size()) <= childIndex) {
        children.add(null);
    } 
    children.set(childIndex, node);
}