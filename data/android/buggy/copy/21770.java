void removeConnection(graph.Connection connection) {
    connection.getStart().uncolor();
    connection.getEnd().uncolor();
    connections.remove(connection);
    graph.structurallyChanged();
}