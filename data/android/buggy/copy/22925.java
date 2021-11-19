@java.lang.Override
public void setNodeState(com.roboclub.robobuggy.nodes.baseNodes.NodeState state) {
    this.state = state;
    lastUpdate = java.lang.System.currentTimeMillis();
}