public com.overmc.overpermissions.api.NodeBatch.Builder addNode(java.lang.String node, java.lang.String worldName) {
    com.google.common.base.Preconditions.checkNotNull(node, "The node can't be null!");
    com.google.common.base.Preconditions.checkNotNull(node, "The world can't be null!");
    worldNodes.put(node, worldName.toLowerCase());
    return this;
}