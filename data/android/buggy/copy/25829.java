public void removeChild(int index) {
    org.oddjob.monitor.model.JobTreeNode child = nodeList.remove(index);
    child.destroy();
    model.fireTreeNodesRemoved(this, child, index);
}