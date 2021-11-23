public long increaseCount() {
    (this.loggingCount)++;
    this.setLastUpdated(new java.util.Date());
    return this.loggingCount;
}