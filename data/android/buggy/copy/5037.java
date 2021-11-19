@java.lang.Override
public void setValue(int value) {
    withLock(() -> bytes.append(((offset) + (net.openhft.chronicle.wire.IntTextReference.VALUE)), value, 10));
}