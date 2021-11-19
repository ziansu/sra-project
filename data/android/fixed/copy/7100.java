public int outDegree(diag.stn.STN.Vertex fro) {
    java.util.LinkedHashSet<diag.stn.STN.DEdge> edges = map.get(fro);
    if (edges == null)
        return 0;
    
    return edges.size();
}