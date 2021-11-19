@java.lang.Override
public io.mycat.bigmem.buffer.Chunk<java.nio.ByteBuffer> newUnpoolChunk(int capacity) {
    io.mycat.bigmem.buffer.Chunk<java.nio.ByteBuffer> chunk = new io.mycat.bigmem.buffer.Chunk<java.nio.ByteBuffer>(this, java.nio.ByteBuffer.allocateDirect(capacity), capacity);
    return chunk;
}