void updateIntervals(int intervalSeconds, int retryIntervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    this.retryIntervalSeconds = retryIntervalSeconds;
    scheduleNext();
}