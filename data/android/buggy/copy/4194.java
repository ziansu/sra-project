@java.lang.Override
protected org.neo4j.graphdb.Node fetchNextOrNull() {
    assert ids != null : "ids null";
    assert (nodeManager) != null : "nodeManager null";
    if (ids.hasNext())
        return nodeManager.newNodeProxyById(ids.next());
    else
        return null;
    
}