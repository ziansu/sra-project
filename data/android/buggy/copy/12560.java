private void leave(final org.matsim.core.events.algorithms.SnapshotGenerator.EventAgent agent) {
    this.drivingQueue.remove(agent);
    this.buffer.remove(agent);
    this.leftAgentsList.add(agent);
    agent.currentLink = null;
}