@java.lang.Override
public void threadExitsOnTimeout(long executorId) {
    logger.debug((("executor " + executorId) + " exits on timeout"));
    readyThreadsNumber.decrementAndGet();
    workersMap.remove(executorId);
}