@com.facebook.react.bridge.ReactMethod
public void getFromResponse(java.lang.String url, com.facebook.react.bridge.Promise promise) throws java.io.IOException, java.net.URISyntaxException {
    promise.resolve(url);
}