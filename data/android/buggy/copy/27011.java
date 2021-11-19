public byte[] intToByte1(int i, byte[] target, int offset) {
    target[offset] = ((byte) (i & 255));
    return target;
}