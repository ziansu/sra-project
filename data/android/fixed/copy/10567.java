public void setChildren(algorithms.imageProcessing.DoubleLinkedCircularList children) {
    this.children = children;
    if (children != null) {
        numberOfChildren = ((int) (children.number));
    }
}