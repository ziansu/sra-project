public synchronized boolean hasInflightRequests() {
    return !(pendingOperationsWithSize.isEmpty());
}