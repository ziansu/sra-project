@java.lang.Override
public void received(java.nio.ByteBuffer buffer) {
    m.reset();
    r.received(buffer);
}