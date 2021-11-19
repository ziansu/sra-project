private boolean finished() {
    boolean finished = false;
    finished = (failedJobsQueue.isEmpty()) && (parallelOperationLimiter.isEmpty());
    return finished;
}