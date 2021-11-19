public byte[] read(long offset, byte[] data) {
    return read(offset, ((int) ((getLength()) - offset)), data);
}