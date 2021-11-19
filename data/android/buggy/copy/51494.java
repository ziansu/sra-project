@java.lang.Override
public void onDisconnect() {
    android.util.Log.v(me.iasc.vultureegg.app.DeviceControlActivity.TAG, "mCottonServer onDisconnect");
    me.iasc.vultureegg.app.DeviceControlActivity.isCottonReady = false;
}