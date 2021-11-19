private void notifyFlush() {
    for (final org.exist.storage.ContentLoadingObserver observer : contentLoadingObservers) {
        try {
            observer.flush();
        } catch (final org.exist.storage.DBException e) {
            org.exist.storage.LOG.error(e);
        }
    }
}