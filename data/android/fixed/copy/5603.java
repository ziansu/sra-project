@java.lang.Override
public synchronized long nextValue() {
    if ((offset) == 0) {
        newSegment();
    }
    if ((++(offset)) == (org.apache.giraffa.id.SegmentedId.SEGMENT_SIZE)) {
        offset = 0;
    }
    return ++(value);
}