@com.facebook.react.bridge.ReactMethod
@android.support.annotation.NonNull
public java.lang.Object variationForKeyWithDefaultValue(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.NonNull
java.lang.Object defaultValue, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object retrievedObject = com.vwo.mobile.VWO.getVariationForKey(key, defaultValue);
    if (callback != null) {
        callback.invoke(null, retrievedObject);
    }
    return retrievedObject;
}