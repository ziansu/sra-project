protected java.lang.String readText(int block) {
    byte[] result = readBinary(block);
    return new java.lang.String(result, charset);
}