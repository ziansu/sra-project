@com.facebook.react.bridge.ReactMethod
public java.lang.String version(@android.support.annotation.NonNull
com.facebook.react.bridge.Callback callback) {
    java.lang.String version = com.vwo.mobile.VWO.version();
    callback.invoke(null, version);
    return version;
}