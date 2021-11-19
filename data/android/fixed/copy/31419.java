private int jamgetuword(java.nio.ByteBuffer bb, int offset) {
    int uw;
    uw = (bb.get(offset)) + ((bb.get((offset + 1))) * 256);
    return uw;
}