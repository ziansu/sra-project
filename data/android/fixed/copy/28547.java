public java.util.Map<java.lang.Integer, java.lang.Double> getOutEdgeWeights(int id) {
    if (!(graph.setCurrent(id)))
        return null;
    
    return new java.util.HashMap(graph.getEdgeWeights());
}