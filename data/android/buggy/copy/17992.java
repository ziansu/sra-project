public long[] read(long offset, long[] data) {
    return read(offset, ((int) (((getLength()) - offset) + 1)), data);
}