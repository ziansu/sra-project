@org.chromium.base.annotations.CalledByNative
public boolean isMasterSyncEnabled() {
    org.chromium.base.ThreadUtils.assertOnUiThread();
    assert (mMasterSyncEnabledProvider) != null;
    return mMasterSyncEnabledProvider.isMasterSyncEnabled();
}