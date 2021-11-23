private void initializeMediaPlayer() {
    if ((leMediaPlayer) == null) {
        leMediaPlayer = new android.media.MediaPlayer();
    }else {
        leMediaPlayer.reset();
    }
    playerStatus = !(leMediaPlayer.equals(null));
}