@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onServiceConnected(final android.content.ComponentName name, final android.os.IBinder service) {
    mService = ((diplom.jodoapp.LocalBinder<diplom.jodoapp.XMPPServiceConnection>) (service)).getService();
    mBounded = true;
    android.util.Log.d(diplom.jodoapp.LoginActivity.TAG, "onServiceConnected");
}