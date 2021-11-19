public void rotateRight() {
    for (Game.Coordinate c : selectedPiece.coords) {
        int oldX = c.x;
        int oldY = c.y;
        c.x = 1 * oldY;
        c.y = (-1) * oldX;
    }
}