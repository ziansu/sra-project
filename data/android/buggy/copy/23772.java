private boolean isValidRootNode(extraction.ObjectNode node) {
    java.util.Set<org.jgrapht.graph.DefaultEdge> edges = outgoingEdgesOf(node);
    return (edges.size()) == 1;
}