private int skipTagBlock() throws java.io.IOException {
    in.skipBytes(1);
    int length = in.readShort();
    in.skipBytes(length);
    return length;
}