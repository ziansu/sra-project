public com.tcdi.zombodb.query_parser.metadata.Dijkstra.Vertex add(java.lang.String name, java.lang.String index, double weight) {
    com.tcdi.zombodb.query_parser.metadata.Dijkstra.Edge e;
    add((e = edge(name, index, weight)));
    return e.target;
}