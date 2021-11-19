@java.lang.Override
public long getValue() {
    return withLock(() -> bytes.parseLong(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE))));
}