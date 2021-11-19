public void initMem(byte[] data) {
    this.memory.write(0, data, data.length, false);
}