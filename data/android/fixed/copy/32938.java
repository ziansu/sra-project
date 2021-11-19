@java.lang.Override
public long getSizeInBytes() {
    long result = sizeInBytes;
    if (result < 0) {
        result = calculateSize();
        sizeInBytes = result;
    }
    return result;
}