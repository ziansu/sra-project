@com.facebook.react.bridge.ReactMethod
public int startGyroscope(int delay) {
    if ((mGyroscopeRecord) == null)
        mGyroscopeRecord = new com.sensormanager.GyroscopeRecord(mReactContext);
    
    return mGyroscopeRecord.start(delay);
}