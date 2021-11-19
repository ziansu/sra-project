@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    hideProgressDialog();
    if (isFinishing()) {
        stopScan();
        no.nordicsemi.android.thingylib.ThingySdkManager.clearInstance();
    }
}