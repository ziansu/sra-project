@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mp.start();
    changePlayerState(true);
    changeNotificationMessage();
    com.tan.musicplayer.MusicPlayerApplication.executeDBRunning(mRencentDBRunnable);
}