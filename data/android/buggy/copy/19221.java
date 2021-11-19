public boolean addNodeGroup(execinfo.NodeGroup nodeGroup) {
    if ((nodeGroup.getNodeGroupBundle()) != null) {
        assert false;
        return false;
    }
    nodeGroup.setNodeGroupBundle(this);
    set.add(nodeGroup);
    return true;
}