public java.util.Map<java.lang.Integer, java.lang.Double> getOutEdgeWeights(int id) {
    graph.setCurrent(id);
    return new java.util.HashMap(graph.getEdgeWeights());
}