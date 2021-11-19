private long getNextNodeId(student.Nodes.CavernNode location) {
    if (!(pathExists()))
        getNextMoveFromNewPath();
    
    return getNextPathNodeId();
}