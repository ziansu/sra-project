private int indexOfY(Y y) {
    for (int i = 0; i < (yLength); i++) {
        if ((yArray[i].value) == y) {
            return i;
        }
    }
    return -1;
}