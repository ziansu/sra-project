public static byte[] decode(final byte[] inputBuffer, int inputPtr, int inputLen) throws java.io.IOException {
    return com.ning.compress.lzf.util.ChunkDecoderFactory.optimalInstance().decode(inputBuffer);
}