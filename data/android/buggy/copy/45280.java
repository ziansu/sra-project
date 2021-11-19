final boolean cas(long cmp, long val) {
    return io.dropwizard.metrics.Striped64.Cell.valueUpdater.compareAndSet(this, cmp, value);
}