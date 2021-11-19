@java.lang.Override
public void received(java.nio.ByteBuffer buffer) {
    m.reset();
    if (r != null) {
        r.received(buffer);
    }
}