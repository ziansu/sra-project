public void setCurrentState(com.cmpe.raft.consensus.node.state.NodeState currentState) {
    if ((this.currentState) != null) {
        this.currentState.stopJobs();
    }
    this.currentState = currentState;
    this.currentState.performTask();
}