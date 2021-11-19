private int jumpN() {
    byte offset = ((byte) (memory.readByte(pc)));
    (pc)++;
    pc += offset;
    return 8;
}