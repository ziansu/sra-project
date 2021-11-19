public long read(int address) {
    return (memory[address]) & (mask);
}