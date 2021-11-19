@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    stopSelf();
    return true;
}