model.Node findEnd() {
    model.Node currentNode = this;
    while ((nextNode) != null) {
        currentNode = currentNode.nextNode;
    } 
    return currentNode;
}