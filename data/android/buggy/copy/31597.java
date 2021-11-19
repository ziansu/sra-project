private char getSymbol() {
    if ((basher) == 1) {
        return 'A';
    }
    if (((key) == 0) && ((mapType) == 2)) {
        return 'K';
    }
    return 'H';
}