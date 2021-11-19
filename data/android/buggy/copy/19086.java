@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    updatePlayer();
    if ((currentChapter.getCurrentDuration()) > 0) {
        newtech.audiolibrary.adapters.PlayThread.mediaPlayer.seekTo(currentChapter.getCurrentDuration());
    }
    newtech.audiolibrary.adapters.PlayThread.mediaPlayer.start();
}