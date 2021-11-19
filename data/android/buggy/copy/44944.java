public boolean isRoot(T node) {
    org.zkoss.ganttz.util.MutableTreeModel.Node<T> associatedNode = find(node);
    return associatedNode.isRoot();
}