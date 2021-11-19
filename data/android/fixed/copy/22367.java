@java.lang.Override
public void onUnexpectedError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onUnexpectedError Msg=" + (e.getLocalizedMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage(), null);
}