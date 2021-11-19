private int incCurIndex() {
    int i = curIndex;
    curIndex += 1;
    if ((curIndex) >= (opNumbers.size())) {
        curIndex = 0;
    }
    return i;
}