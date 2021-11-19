@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
    com.adsamcik.signalcollector.DataStore.deleteFile(name);
    com.adsamcik.signalcollector.services.TrackerService.approxSize -= size;
    android.util.Log.d(com.adsamcik.signalcollector.DataStore.TAG, ("Successfully uploaded " + name));
}