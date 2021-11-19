@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    mediaPlayer.stop();
    mediaPlayer.release();
    if ((seekBarUpdateHandler) != null)
        seekBarUpdateHandler.removeCallbacks(seekBarUpdateRunnable);
    
    return false;
}