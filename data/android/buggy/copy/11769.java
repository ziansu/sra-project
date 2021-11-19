public void Stop() {
    if ((classifyPool) != null) {
        stop = true;
        classifyPool.shutdownNow();
    }
}