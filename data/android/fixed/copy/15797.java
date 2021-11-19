public synchronized void finish() {
    if (((id) != null) && ((finishedAt) == null)) {
        finishedAt = java.lang.System.currentTimeMillis();
    }
}