public void stopPlayer() {
    savePlayerPosition();
    player.stop();
    player.prepare(null);
    player = null;
    mediaSource = null;
    notifyPropertyChanged(BR.mediaSource);
}