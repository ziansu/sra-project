public void addChild(com.nucleus.scene.Node child) {
    children.add(child);
    child.parent = this;
    child.setRootNode(getRootNode());
}