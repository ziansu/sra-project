protected java.lang.String readText(int block) {
    byte[] result = readBinary(block);
    if (result == null) {
        return null;
    }
    return new java.lang.String(result, charset);
}