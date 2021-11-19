@java.lang.Override
public void Union(int node1Id, int node2Id) {
    if (IsConnected(node1Id, node2Id))
        return ;
    
    nodeIds[Root(node2Id)] = nodeIds[Root(node1Id)];
}