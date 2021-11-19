public int read8(byte[] ram, int pc) {
    return (ram[pc]) & 255;
}