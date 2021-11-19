public void refresh() {
    gc.clearRect(0, 0, WIDTH, HEIGHT);
    displayBrickWall();
    moveAndDisplayBall();
    moveAndDisplayPlayer();
}