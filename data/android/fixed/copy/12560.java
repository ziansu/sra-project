private void leave(final org.matsim.core.events.algorithms.SnapshotGenerator.EventAgent agent) {
    this.drivingQueue.remove(agent);
    this.buffer.remove(agent);
    agent.currentLink = null;
}