public org.jenkinsci.plugins.dirdigger.TreeNode<T> addChild(T child) {
    org.jenkinsci.plugins.dirdigger.TreeNode<T> childNode = new org.jenkinsci.plugins.dirdigger.TreeNode<T>(child);
    childNode.parent = this;
    this.children.add(childNode);
    return childNode;
}