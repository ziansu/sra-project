@java.lang.Override
public <T> T removeProperty(java.lang.String key) {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    graph.setCurrentGraphInThreadLocal();
    if ((rawElement) != null)
        return super.removeProperty(key);
    
    return null;
}