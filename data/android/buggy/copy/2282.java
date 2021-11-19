private void releasePlayer() {
    playerPosition = player.getCurrentPosition();
    if ((player) != null) {
        player.stop();
        player.release();
        player = null;
    }
}