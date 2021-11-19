public java.lang.Iterable<T> getIncomingSourcesData() {
    return new org.jruby.compiler.ir.util.DataIterable<T>(getIncomingEdges(), null, true);
}