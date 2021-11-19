public com.piratesgame.graph.vertices.Vertex getNeighbour(com.piratesgame.graph.vertices.Vertex v) {
    if (v.equals(this.vertexOne)) {
        return this.vertexTwo;
    }else
        if (v.equals(this.vertexTwo)) {
            return this.vertexOne;
        }
    
    return null;
}