@java.lang.Override
public io.mycat.bigmem.buffer.Chunk<sun.nio.ch.DirectBuffer> newUnpoolChunk(int capacity) {
    io.mycat.bigmem.buffer.Chunk<sun.nio.ch.DirectBuffer> chunk = new io.mycat.bigmem.buffer.Chunk<sun.nio.ch.DirectBuffer>(this, ((sun.nio.ch.DirectBuffer) (java.nio.ByteBuffer.allocateDirect(capacity))), capacity);
    return chunk;
}