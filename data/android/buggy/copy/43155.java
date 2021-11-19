void notifyException(java.lang.Exception exception) {
    this.exception = exception;
    prepared.countDown();
    startable.countDown();
    finished.countDown();
    if ((testThread) != null) {
        testThread.interrupt();
    }
}