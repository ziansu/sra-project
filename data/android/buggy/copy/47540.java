public synchronized boolean hasInflightRequests() {
    cleanupFinishedOperations();
    return !(pendingOperationsWithSize.isEmpty());
}