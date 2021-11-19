public void removeBall() {
    ballX.getAndSet((-100));
    ballY.getAndSet((-100));
    doDraw();
}