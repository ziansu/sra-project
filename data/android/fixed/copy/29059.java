@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    binder = ((unipd.dei.ESP1415.falldetector.FallService.MyBinder) (service));
    mService = binder.getService();
    mBound = true;
}