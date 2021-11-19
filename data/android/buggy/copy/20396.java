@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    mp = null;
    player = null;
    isPlaying = false;
    mediaPlayerCallback.onFinishedPlaying();
}