@java.lang.Override
public int getNextSourceSequenceCount() {
    int i;
    synchronized(this) {
        i = ++(sequenceCount);
        if ((sequenceCount) > 16383) {
            sequenceCount = 0;
        }
    }
    return i;
}