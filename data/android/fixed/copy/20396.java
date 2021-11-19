@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    player = null;
    isPlaying = false;
    mediaPlayerCallback.onFinishedPlaying();
}