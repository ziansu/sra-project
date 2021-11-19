@java.lang.Override
public long intervalStart() {
    long difference = ((maxIndex) - (index)) + 1;
    return -((remainderNanos) + (difference * (nanosPerSlot)));
}