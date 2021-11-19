@java.lang.Override
public long nodeCreate(org.neo4j.kernel.impl.api.KernelStatement state) {
    long nodeId = storeLayer.reserveNode();
    state.txState().nodeDoCreate(nodeId);
    return nodeId;
}