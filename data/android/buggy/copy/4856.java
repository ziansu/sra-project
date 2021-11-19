public void removeCastPlayer() {
    if ((castPlayer) != null) {
        castPlayer.removePlayer();
        castPlayer.setPlayerCallback(null);
        castPlayer.setPlayerListener(null);
        castPlayer = null;
    }
}