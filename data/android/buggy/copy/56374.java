private static byte setBinaryData2ForCommonMessage() {
    byte res = 0;
    res |= 1 << 7;
    res |= 1 << 6;
    return res;
}