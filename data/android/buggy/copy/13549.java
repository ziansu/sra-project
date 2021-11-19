public static org.agrona.concurrent.UnsafeBuffer createMetaDataBuffer(final java.nio.ByteBuffer buffer) {
    return new org.agrona.concurrent.UnsafeBuffer(buffer, 0, ((SIZE_OF_INT) + (io.aeron.CncFileDescriptor.META_DATA_LENGTH)));
}