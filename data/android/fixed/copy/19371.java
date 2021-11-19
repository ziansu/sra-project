public void onServiceDisconnected(android.content.ComponentName className) {
    mService = null;
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "Disconnected from location service");
}