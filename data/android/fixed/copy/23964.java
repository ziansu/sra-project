void removeVertex(graph.Vertex vertexToRemove) {
    graph.getConnectionManager().removeVertex(vertexToRemove);
    vertices.remove(vertexToRemove.getID());
}