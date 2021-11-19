private boolean isValidRootNode(java.lang.Integer node) {
    java.util.Set<org.jgrapht.graph.DefaultEdge> edges = outgoingEdgesOf(node);
    return (edges.size()) == 1;
}