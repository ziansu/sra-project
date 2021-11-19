@java.lang.Override
public long intervalStart() {
    return -((remainderNanos) + ((((maxIndex) - (index)) + 1) * (nanosPerSlot)));
}