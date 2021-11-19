@java.lang.Override
public void run() {
    mRawData = rawData;
    mGPSManager.startSeeking();
    mBeaconManager.startSeeking();
}