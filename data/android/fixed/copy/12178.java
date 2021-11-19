private void ioWrite(final short port, final byte data) {
    cycleBudget -= 4;
    io.write((port & 255), (data & 255));
}