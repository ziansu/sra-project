public int getNodeCount() {
    int sum = 1;
    for (node.Node<D> child : getChildren()) {
        sum += getNodeCount();
    }
    return sum;
}