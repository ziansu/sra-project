public void startExecution() {
    taskStatistics.startExecution();
    if (isAborted()) {
        executorStatistics.incrementAbortedTaskCount();
    }
}