void pause() {
    if (play) {
        timer.cancel();
        paused = true;
        soundOFF();
    }
}