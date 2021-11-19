@java.lang.Override
public boolean isDone() {
    return ((base) == ((numOfPackets) + (initSeqNo))) && ((nextSeqNum) == (base));
}