public void addRootNode(T data) {
    this.dataSet.add(data);
    this.rootNode = new model.graph.implementation.NodeImpl(data);
}