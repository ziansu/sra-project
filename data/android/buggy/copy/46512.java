public void incrementDoublesInARow() {
    if ((dice[0].getFaceValue()) == (dice[1].getFaceValue())) {
        doublesInARow = (doublesInARow)++;
    }else {
        doublesInARow = 0;
    }
}