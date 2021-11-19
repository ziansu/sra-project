int logicToPhysic(int at) {
    return ((pages[(at >> 10)]) << 10) + (at & 1023);
}