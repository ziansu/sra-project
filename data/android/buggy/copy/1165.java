public void stop() {
    long now = java.lang.System.currentTimeMillis();
    assert (lastStartTime) != null : "Has not been started or re-started since last stop!";
    times.add((now - (lastStartTime)));
    lastStartTime = null;
}