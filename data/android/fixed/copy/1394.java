@java.lang.Override
public java.util.List<java.lang.String> getNeighbours(java.lang.String vertex) {
    if (!(hasVertex(vertex)))
        return null;
    
    return new java.util.ArrayList<java.lang.String>(v.get(vertex));
}