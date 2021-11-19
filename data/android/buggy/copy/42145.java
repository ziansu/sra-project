private void playMusic(int song) {
    android.util.Log.i(TAG, "playing music");
    android.media.MediaPlayer play = android.media.MediaPlayer.create(this, song);
    play.start();
}