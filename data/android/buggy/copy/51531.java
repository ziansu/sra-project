void gameOver() {
    if ((hasEmptySquare()) && (!(hasEqualNeighbour()))) {
        new kevin.GameOverScreen();
    }
}