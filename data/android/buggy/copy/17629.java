@com.facebook.react.bridge.ReactMethod
public int startGyroscope(int delay) {
    mGyroscopeRecord = new com.sensormanager.GyroscopeRecord(mReactContext);
    return mGyroscopeRecord.start(delay);
}