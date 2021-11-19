@java.lang.Override
public void onResolveFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
    android.util.Log.e(moe.retro.unijoysticle.BaseActivity.TAG, ("Resolve failed" + errorCode));
    mFinishedResolve = true;
}