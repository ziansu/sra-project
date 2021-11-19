@java.lang.Override
public void onClick(android.view.View v) {
    final android.content.Intent syncServiceIntent = new android.content.Intent(getBaseContext(), com.nitdgp.arka.psync.SyncService.class);
    if (syncServiceBound) {
        unbindService(syncServiceConnection);
    }
    syncServiceBound = false;
    stopService(syncServiceIntent);
    stopPeerListUIThread();
}