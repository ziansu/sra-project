private void assertFragContainsNoAggPlanNodes(org.voltdb.plannodes.AbstractPlanNode node) {
    java.util.List<org.voltdb.plannodes.AbstractPlanNode> aggNodes = findAllAggPlanNodes(node);
    assertEquals("Found an aggregation node in fragment, but didn't expect to!", 0, aggNodes.size());
}