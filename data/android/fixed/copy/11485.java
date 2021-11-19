private void ensureInitialized() {
    synchronized(initializationLock) {
        if (!(isInitialized)) {
            replayRequests(persistedState.getAllRequests());
            isInitialized = true;
        }
    }
}