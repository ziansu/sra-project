@java.lang.SuppressWarnings(value = "unchecked")
public org.apache.flink.graph.streaming.EdgeOnlyStream<K, EV> union(org.apache.flink.graph.streaming.EdgeOnlyStream<K, EV> graph) {
    return new org.apache.flink.graph.streaming.EdgeOnlyStream(this.edges.merge(graph.getEdges()), this.getContext());
}