@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    duration = mp.getDuration();
    playMedia();
}