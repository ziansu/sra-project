public void setMediaPlayer(android.media.MediaPlayer newVal) {
    if (newVal == null) {
        mediaplayer = new android.media.MediaPlayer();
    }else {
        mediaplayer = newVal;
    }
}