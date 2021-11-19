@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.seekTo(0);
    mediaPlayer.setLooping(true);
}