public void addChild(int index, com.nucleus.scene.Node child) {
    children.add(index, child);
    child.parent = this;
}