@java.lang.Override
public void run() {
    android.util.Log.d(ching.android_localsocket.localsocket.ClientConnect.TAG, "Loop");
    mHandler.postDelayed(this, 1000);
    recv();
}