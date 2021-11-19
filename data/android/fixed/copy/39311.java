@java.lang.Override
public long getValue() {
    return withLock(() -> {
        return bytes.parseLong(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE)));
    });
}