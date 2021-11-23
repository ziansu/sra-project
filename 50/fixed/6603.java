public static int o(int oe) {
    int i = oe >> 16;
    return i < 0 ? i + 1 : i;
}