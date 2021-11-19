private int determineCurrentPosition(int startingPosition) {
    int position = startingPosition;
    if (startsWithSign) {
        if (!(negative)) {
            position = position + 1;
        }
    }
    return position;
}