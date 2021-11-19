private int wrapZ(int z) {
    return ((z % (depth)) + (depth)) % (depth);
}