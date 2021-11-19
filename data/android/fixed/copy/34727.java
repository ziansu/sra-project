public boolean AddDevice(networkmodeling.core.modelgraph.NetworkGraphNode dev) {
    if (!(graphNodes.contains(dev))) {
        graphNodes.add(dev);
        return true;
    }
    return false;
}