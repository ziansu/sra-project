@java.lang.Override
public org.theta4j.ptp.type.UINT32 next() {
    if (4294967295L <= (current)) {
        current = 0;
    }
    return new org.theta4j.ptp.type.UINT32(((current)++));
}