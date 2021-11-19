@java.lang.Override
public boolean hasNext() {
    nextCount = 0;
    return (hOffset) < (hilbertValueCount);
}