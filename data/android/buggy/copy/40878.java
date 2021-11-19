private int jumpN() {
    pc += 1 + ((byte) (memory.readByte(pc)));
    return 8;
}