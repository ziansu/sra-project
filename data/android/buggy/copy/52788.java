public byte readBinaryByte() throws net.rpgtoolkit.common.CorruptAssetException {
    try {
        return ((byte) (inputStream.read()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return 0;
    }
}