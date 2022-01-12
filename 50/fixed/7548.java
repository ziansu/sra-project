public void extendAndWrite(int address, int allocSize, byte[] data) {
    extend(address, allocSize);
    write(address, data, data.length, false);
}