@java.lang.Override
public boolean onUnbind(com.cntt.freemusicdownloadnow.player.Intent intent) {
    progressBarHandler.removeCallbacks(mUpdateTimeTask);
    java.lang.Thread.currentThread().interrupt();
    unregisterReceiver(mediaControlsBroadcastReceiver);
    player.release();
    player = null;
    return super.onUnbind(intent);
}