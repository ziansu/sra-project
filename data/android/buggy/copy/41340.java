public void timerFired() {
    tyrone.move();
    checkBallPos(ball);
    ball.move();
    handleCollision(tyrone, ball);
}