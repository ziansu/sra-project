@java.lang.Override
public int outDegreeOf(V vertex) {
    int degree = 0;
    if (primaryGraph.containsVertex(vertex))
        degree += primaryGraph.outDegreeOf(vertex);
    
    return degree + (super.outDegreeOf(vertex));
}