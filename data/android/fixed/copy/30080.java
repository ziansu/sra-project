protected java.lang.Long getLastPublishedIDByNode(java.lang.String nodeID) throws org.wso2.andes.kernel.AndesException {
    java.lang.Long lastPublishId;
    lastPublishId = slotAgent.getNodeToLastPublishedId(nodeID);
    return lastPublishId;
}