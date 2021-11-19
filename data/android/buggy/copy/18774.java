public void stop() {
    timer.stop();
    setTime(0, 0);
    this.setColor(pauseColour);
}