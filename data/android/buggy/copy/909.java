void resume() {
    timer = new java.util.Timer();
    timer.scheduleAtFixedRate(new brickbreaker.source.Animate(this), brickbreaker.source.DELAY, brickbreaker.source.PERIOD);
    paused = false;
    soundON();
}