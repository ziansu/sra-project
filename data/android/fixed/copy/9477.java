public void addRootNode(T data) {
    dataSet.add(data);
    rootNode = new model.graph.implementation.NodeImpl(data);
}