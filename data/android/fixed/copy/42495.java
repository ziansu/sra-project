@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    videoEndAt = mp.getDuration();
    android.util.Log.d(LOG_TAG, ("onPrepared: " + (videoEndAt)));
}