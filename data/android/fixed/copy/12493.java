@java.lang.Override
public int readLength() {
    if ((availableForReading()) < 1) {
        return -1;
    }
    return ((int) (_buffer[((_readPtr)++)]));
}