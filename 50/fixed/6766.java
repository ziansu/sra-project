public static int calculateUncompressedSize(byte[] data, int offset, int length) throws java.io.IOException {
    return com.ning.compress.lzf.ChunkDecoder.calculateUncompressedSize(data, length, length);
}