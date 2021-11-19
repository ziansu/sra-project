public void addEdgeAndCity(int city, java.lang.String edge) {
    citiesNotVisited.remove(java.lang.Integer.valueOf(city));
    path[currPathIndex] = city;
    pathEdges[currPathIndex] = edge;
    (currPathIndex)++;
}