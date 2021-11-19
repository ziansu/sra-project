@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    android.util.Log.i("AudioService", "start to play music");
    mediaPlayer.start();
}