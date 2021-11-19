public org.ethereum.net.rlpx.discover.NodeStatistics getNodeStatistics(org.ethereum.net.rlpx.discover.Node n) {
    return discoveryEnabled ? getNodeHandler(n).getNodeStatistics() : org.ethereum.net.rlpx.discover.NodeManager.DUMMY_STAT;
}