private int getCirculationIndex(int index, int length) {
    if (index > (length - 1)) {
        return index % length;
    }
    return index;
}