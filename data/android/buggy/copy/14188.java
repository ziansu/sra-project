public static void checkOffsetAndCount(final byte[] buffer, final int byteOffset, final int byteCount) {
    com.google.gwt.core.shared.impl.InternalPreconditions.checkNotNull(buffer);
    java.io.IOUtils.checkOffsetAndCount(buffer.length, byteOffset, byteCount);
}