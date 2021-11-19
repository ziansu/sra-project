protected void checkIfAttached() {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if (graph == null)
        throw new java.lang.IllegalStateException("There is no active graph instance for current element. Please either open connection to your storage, or use detach/attach methods instead.");
    
}