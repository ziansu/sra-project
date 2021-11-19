public void addEdgeFromThis(java.lang.String otherID, int weight) {
    addEdge(new Edge(this, Vertex.ids.get(otherID), weight));
}