private int SHR3() {
    int jz = jsr;
    int jzr = jsr;
    jzr ^= jzr << 13;
    jzr ^= jzr >>> 17;
    jzr ^= jzr << 5;
    jsr = jzr;
    return jz + jzr;
}