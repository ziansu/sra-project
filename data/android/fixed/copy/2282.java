private void releasePlayer() {
    if ((player) != null) {
        playerPosition = player.getCurrentPosition();
        player.stop();
        player.release();
        player = null;
    }
}