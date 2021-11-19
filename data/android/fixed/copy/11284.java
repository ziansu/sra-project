private int accumulate(int[] folders) {
    int accum = 0;
    for (int folder : folders) {
        accum += folder;
    }
    return accum;
}