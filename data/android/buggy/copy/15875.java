public final java.util.Set<stanford.cs106.collections.Vertex> neighbors(java.lang.String v) {
    checkVertex(v);
    return adjacencyMap.row(vertex(v)).keySet();
}