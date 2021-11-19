public boolean isRootItem(javafx.scene.control.TreeItem node) {
    if (node == null) {
        return false;
    }else {
        return (node.getParent()) == null ? true : false;
    }
}