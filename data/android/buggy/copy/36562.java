public com.tcdi.zombodb.query_parser.metadata.Dijkstra.Vertex add(java.lang.String name, double weight) {
    com.tcdi.zombodb.query_parser.metadata.Dijkstra.Edge e;
    add((e = edge(name, weight)));
    return e.target;
}