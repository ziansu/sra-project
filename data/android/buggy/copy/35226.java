public void addChild(de.mkrnr.goddag.Node childNode) {
    this.children.add(childNode);
    childNode.parents.add(this);
}