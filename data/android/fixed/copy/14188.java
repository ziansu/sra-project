public static void checkOffsetAndCount(final byte[] buffer, final int byteOffset, final int byteCount) {
    if (buffer == null) {
        throw new java.lang.NullPointerException();
    }
    java.io.IOUtils.checkOffsetAndCount(buffer.length, byteOffset, byteCount);
}