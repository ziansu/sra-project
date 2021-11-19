public void setCurrentState(com.cmpe.raft.consensus.node.state.NodeState currentState) {
    this.currentState.stopJobs();
    this.currentState = currentState;
    this.currentState.performTask();
}