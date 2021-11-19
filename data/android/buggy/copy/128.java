public java.lang.Iterable<T> getOutgoingDestinationsDataOfType(java.lang.Object type) {
    return new org.jruby.compiler.ir.util.DataIterable<T>(getOutgoingEdges(), type, false);
}