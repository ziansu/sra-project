public void addNode(org.neo4j.graphdb.Node node, double rank) {
    if ((topNodes) == null) {
        throw new java.lang.IllegalStateException("Please initialize top ranked nodes first");
    }
    topNodes.add(node, rank);
}