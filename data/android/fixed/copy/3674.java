public org.ethereum.net.rlpx.discover.NodeStatistics getNodeStatistics(org.ethereum.net.rlpx.discover.Node n) {
    return getNodeHandler(n).getNodeStatistics();
}