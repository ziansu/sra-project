public void setNode(byte[] nodeId) {
    node = new org.ethereum.net.server.Node(nodeId, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
    nodeStatistics = nodeManager.getNodeStatistics(node);
}