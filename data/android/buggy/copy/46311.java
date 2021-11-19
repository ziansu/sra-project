@org.junit.Before
public void setUp() {
    graph = new org.onlab.graph.AdjacencyListsGraph(org.onlab.graph.KShortestPathsSearchTest.vertexes(), org.onlab.graph.KShortestPathsSearchTest.edges());
}