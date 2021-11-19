@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (NITConfig.ENABLE_PROXIMITY) {
        android.util.Log.i(MainActivity.TAG, "NITManager proximity listener stop");
        it.near.sdk.NearItManager.getInstance(this).removeProximityListener(this);
    }
}