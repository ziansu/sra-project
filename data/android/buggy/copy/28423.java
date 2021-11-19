@java.lang.Override
public void resetToInitialConnectors() {
    synchronized(topologyArrayGuard) {
        receivedTopology = false;
        topologyArray = null;
        topology.clear();
    }
}