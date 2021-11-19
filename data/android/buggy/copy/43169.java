@java.lang.Override
public void afterCommit() throws java.lang.Exception {
    getDestinationStatistics().getDequeues().increment();
    dropMessage(reference);
    wakeup();
}