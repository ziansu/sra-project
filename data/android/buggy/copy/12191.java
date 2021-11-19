public void pause() {
    player.pause();
    if (paused) {
        paused = false;
    }else {
        paused = true;
    }
}