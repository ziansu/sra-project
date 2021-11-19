@java.lang.Override
public boolean createDirectionalNodeConnection(java.util.UUID startNode, java.util.UUID endNode) {
    if ((exitNodeMap.containsKey(endNode)) || (exitNodeMap.containsKey(startNode))) {
        return false;
    }
    return graphServer.addEdge(startNode, endNode);
}