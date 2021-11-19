public boolean isRootItem(javafx.scene.control.TreeItem node) {
    return (node.getParent()) == null ? true : false;
}