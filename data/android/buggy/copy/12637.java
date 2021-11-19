public java.nio.ByteBuffer buffer() {
    return (memory) != null ? memory.makeView() : null;
}