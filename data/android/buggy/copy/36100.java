@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    com.davapp.spotify.PlayerService.MyBinder myBinder = ((com.davapp.spotify.PlayerService.MyBinder) (service));
    mBoundService = myBinder.getService();
    mServiceBound = true;
}