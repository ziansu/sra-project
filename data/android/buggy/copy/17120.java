private int getEdgeEncoding(int timeStep, int edgeIndex) {
    return ((vertexOffset) + (timeStep * (edges.size()))) + edgeIndex;
}