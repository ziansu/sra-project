@org.junit.Test
public void testRandomEdgeWeight() {
    graph = new cs455.overlay.graph.Graph(generateNodes(10), 4);
    graph.generateConnectedGraph();
    graph.randomlyAssignEdgeWeights();
    org.hamcrest.MatcherAssert.assertThat(graph.isConnected(), org.hamcrest.core.Is.is(true));
}