@com.facebook.react.bridge.ReactMethod
public void getUserAttribute(java.lang.String key, com.facebook.react.bridge.Callback userAttributeCallback) {
    java.lang.String userAttribute;
    try {
        userAttribute = mInstabug.getUserAttribute(key);
        userAttributeCallback.invoke(userAttribute);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}