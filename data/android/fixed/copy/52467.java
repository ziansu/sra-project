public exc.TowerCoordinates getTowerCoordinates(int i) {
    int x = (i % (yDim)) + 1;
    int y = (i / (yDim)) + 1;
    return new exc.TowerCoordinates(x, y);
}