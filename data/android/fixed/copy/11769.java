public void Stop() {
    if ((classifyPool) != null) {
        stop.set(true);
        classifyPool.shutdownNow();
    }
}