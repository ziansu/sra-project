private static uk.me.mjt.ch.DirectedEdge makeUnidirectionalEdgesAndAddToNodes(uk.me.mjt.ch.Node from, uk.me.mjt.ch.Node to, uk.me.mjt.ch.AccessOnly accessOnly) {
    int driveTimeMs = 1000;
    return uk.me.mjt.ch.MakeTestData.makeEdgeAndAddToNodes((((from.nodeId) * 1000000) + (to.nodeId)), from, to, driveTimeMs, accessOnly);
}