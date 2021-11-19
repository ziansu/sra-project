private boolean finished() {
    boolean finished = false;
    finished = (parallelOperationLimiter.isEmpty()) && (failedJobsQueue.isEmpty());
    return finished;
}