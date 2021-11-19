private static int subField(int rowOrCol) {
    return (rowOrCol >> 1) << 1;
}