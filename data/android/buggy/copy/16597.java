@java.lang.Override
public int onNext() {
    (numMessagesSent)++;
    numBitsSent += 10;
    return 10;
}