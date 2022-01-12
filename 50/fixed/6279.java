public int getRD() {
    int result = (header.get(24)) ? 1 : 0;
    return result;
}