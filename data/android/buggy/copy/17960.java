@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d("VideoPlayer", "Completed");
    mp.reset();
    mp.seekTo(0);
    videoUpdateListener.onComplete();
}