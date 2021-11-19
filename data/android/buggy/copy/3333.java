@java.lang.Override
public void incrementSourceCounter(final java.lang.String counterName, final long value) {
    final java.util.concurrent.atomic.AtomicLong previous = sourceCounters.putIfAbsent(counterName, new java.util.concurrent.atomic.AtomicLong(0));
    if (previous != null) {
        previous.addAndGet(value);
    }
}