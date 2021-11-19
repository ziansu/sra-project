private boolean isPlaying() {
    if ((initializer) != null) {
        return com.frostwire.gui.player.MediaPlayer.instance().isThisBeingPlayed(initializer);
    }
    return false;
}