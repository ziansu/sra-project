private static double totalEdgeWeight(Graph g) {
    double sum = 0;
    for (Edge e : g.edges()) {
        sum = sum + (e.weight());
    }
    return sum * 1000;
}