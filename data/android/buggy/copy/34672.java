@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    android.util.Log.e(edu.nthu.nmsl.itri_app.FragmentActivity.TAG, "onServiceDisconnected");
    mBluetoothLeService = null;
    mBound = false;
}