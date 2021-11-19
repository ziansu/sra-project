@org.junit.Before
public void setUp() {
    graph = new org.onlab.graph.AdjacencyListsGraph(vertexes(), edges());
}