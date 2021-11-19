boolean enableBackgroundScan(boolean enable) {
    if (enable) {
        mWifiConfigStore.enableAllNetworks();
    }
    return mWifiNative.enableBackgroundScan(enable);
}