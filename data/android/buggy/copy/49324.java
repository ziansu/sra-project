@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    android.util.Log.i(TAG, "onSocketServiceDisconnected! ");
    socketIsBound = false;
    sSocketservice = null;
}