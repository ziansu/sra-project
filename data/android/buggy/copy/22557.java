private void notifyChangeListenersStateTransition(com.github.oxo42.stateless4j.transitions.Transition<com.couchbase.lite.replicator.ReplicationState, com.couchbase.lite.replicator.ReplicationTrigger> transition) {
    logTransition(transition);
    com.couchbase.lite.replicator.Replication.ChangeEvent changeEvent = new com.couchbase.lite.replicator.Replication.ChangeEvent(this);
    com.couchbase.lite.replicator.ReplicationStateTransition replicationStateTransition = new com.couchbase.lite.replicator.ReplicationStateTransition(transition);
    changeEvent.setTransition(replicationStateTransition);
    notifyChangeListeners(changeEvent);
}