@java.lang.Override
public void inc() {
    long newLocalValue = ++(localValue);
    localValue = newLocalValue;
    com.hazelcast.util.counters.SwCounter.UnsafeSwCounter.UNSAFE.putOrderedLong(this, com.hazelcast.util.counters.SwCounter.UnsafeSwCounter.OFFSET, newLocalValue);
}