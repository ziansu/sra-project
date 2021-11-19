protected final void clearVertexInfo() {
    for (stanford.cs106.collections.Vertex vertex : this.vertexes.values()) {
        vertex.clear();
    }
}