public void insertVertex(martinez.james.Vertex v) {
    v.index = numVertices;
    adjacencyList.add(numVertices, new java.util.LinkedList<>());
    vertices.add(v);
    (numVertices)++;
}