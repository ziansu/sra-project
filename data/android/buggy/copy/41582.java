@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (((mCallback) != null) && (mp != null)) {
        mCallback.playerStateChanged(KPlayerCallback.ENDED);
    }
}