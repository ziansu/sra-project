public void previousMazeLevel() {
    if (((mazeNumber) - 1) >= 0) {
        (this.mazeNumber)--;
        startMazeLevel(mazeNumber);
    }
}