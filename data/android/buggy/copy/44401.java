public org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal<S, E> addFile(final java.lang.Object bytes) {
    this.asAdmin().getBytecode().addStep("saveFile", bytes);
    return this;
}