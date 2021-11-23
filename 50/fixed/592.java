@com.facebook.react.bridge.ReactMethod
public void getOrientation(com.facebook.react.bridge.Callback success) {
    com.facebook.react.bridge.WritableNativeMap data = getDataMap();
    success.invoke(data);
}