public boolean hasStatus() {
    synchronized(taskStatuses) {
        return !(taskStatuses.isEmpty());
    }
}