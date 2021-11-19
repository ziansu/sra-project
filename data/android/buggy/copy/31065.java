@java.lang.Override
protected no.nordicsemi.android.nrftoolbox.profile.BleManager<no.nordicsemi.android.nrftoolbox.hrs.HRSManagerCallbacks> initializeManager() {
    final no.nordicsemi.android.nrftoolbox.hrs.HRSManager mManager = no.nordicsemi.android.nrftoolbox.hrs.HRSManager.getInstance(getApplicationContext());
    mManager.setGattCallbacks(this);
    return mManager;
}