public int indexFromPointer(final long p) {
    return ((int) ((_position) / (_chunkBytes)));
}