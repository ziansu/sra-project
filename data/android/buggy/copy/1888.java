public void stop() {
    if (this.isRunning()) {
        this.endTime = (java.lang.System.nanoTime()) * (stopwatch.Stopwatch.NANOSECONDS);
        isRunning = false;
    }
}