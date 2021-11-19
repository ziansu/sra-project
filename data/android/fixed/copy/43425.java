public java.util.List<de.tuberlin.aec.util.PathLink> getSyncNodePathLinks(java.lang.String startNode, java.lang.String node) {
    return getNodePathLinksByType(startNode, node, de.tuberlin.aec.util.PathConfiguration.LINK_TYPE_SYNC);
}