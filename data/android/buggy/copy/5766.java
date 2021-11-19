public long getStartTime() {
    synchronized(this) {
        if ((startTime) < 0) {
            startTime = java.lang.System.currentTimeMillis();
        }
        return startTime;
    }
}