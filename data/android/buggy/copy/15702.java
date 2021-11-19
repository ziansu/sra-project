@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    updatePlayer("start");
    mp.start();
}