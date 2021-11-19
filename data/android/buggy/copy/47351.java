public void addVertex(T... vertice) {
    for (T vertex : vertice) {
        if (edgesByVertices.containsKey(vertex))
            return ;
        
        edgesByVertices.put(vertex, new java.util.LinkedList<>());
    }
}