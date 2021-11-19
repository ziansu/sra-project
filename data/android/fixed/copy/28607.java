@java.lang.Override
public java.util.Collection<eu.unitn.disi.db.grava.graphs.Edge> edgesOf(java.lang.Long id) throws java.lang.NullPointerException {
    java.util.Collection<eu.unitn.disi.db.grava.graphs.Edge> totalEdges = new java.util.HashSet(incomingEdgesOf(id));
    totalEdges.addAll(outgoingEdgesOf(id));
    return totalEdges;
}