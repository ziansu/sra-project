void addConnection(graph.Vertex start, graph.Vertex end) {
    connections.add(new graph.Connection(start, end));
    start.uncolor();
    end.uncolor();
    graph.structurallyChanged();
}