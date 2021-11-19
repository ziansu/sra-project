@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] response, java.lang.Throwable error) {
    com.facebook.react.bridge.WritableMap responseMap = populateResponseData(statusCode, headers, response);
    cb.invoke(error.getMessage(), responseMap);
}