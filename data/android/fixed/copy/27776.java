private void incrementReportEntity(final java.util.concurrent.atomic.AtomicLong entity) {
    if (this.enableCounters) {
        entity.incrementAndGet();
    }
}