public void readGraph(org.w3c.dom.NodeList vList, org.w3c.dom.NodeList eList, java.util.Map<java.lang.String, br.uff.ic.utility.graph.Vertex> vertices, java.util.Collection<br.uff.ic.utility.graph.Edge> edges) {
    readVertices(vList, vertices);
    readEdges(eList, edges);
}