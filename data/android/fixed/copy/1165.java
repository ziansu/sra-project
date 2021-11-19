public void stop() {
    long now = java.lang.System.currentTimeMillis();
    if ((lastStartTime) == null) {
        lastStartTime = now;
    }
    times.add((now - (lastStartTime)));
    lastStartTime = null;
}