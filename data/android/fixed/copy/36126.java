public Graph.Path dijkstra(Graph.Node start, Graph.Node target) {
    java.util.Map<Graph.Node, Graph.Edge> par = dijkstra(start);
    return extractPath(target, par);
}