public boolean graphContainsVertexWithCoordinates(pathfinding.LatLngFlr c) {
    pathfinding.LatLngGraphVertex vTemp = new pathfinding.LatLngGraphVertex(c, 0, pathfinding.JGraphTWrapper.GraphElementType.DEFAULT);
    return graph.containsVertex(vTemp);
}