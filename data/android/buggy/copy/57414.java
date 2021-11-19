public static int decode(final byte[] sourceBuffer, int inPtr, int inLength, final byte[] targetBuffer) throws java.io.IOException {
    return com.ning.compress.lzf.util.ChunkDecoderFactory.optimalInstance().decode(sourceBuffer, inPtr, inLength, targetBuffer);
}