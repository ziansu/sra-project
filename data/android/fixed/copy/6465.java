protected com.tinkerpop.blueprints.impls.orient.OrientBaseGraph setCurrentGraphInThreadLocal() {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if (graph != null)
        graph.setCurrentGraphInThreadLocal();
    
    return graph;
}