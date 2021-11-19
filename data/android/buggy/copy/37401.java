public java.lang.String[] read(long offset, java.lang.String[] data) {
    return read(offset, ((int) (((getLength()) - offset) + 1)), data);
}