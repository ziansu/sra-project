@java.lang.Override
public void onNetworkError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.d(org.matrix.androidsdk.data.EventTimeline.LOG_TAG, "backPaginate onNetworkError");
    mIsBackPaginating = false;
    if (null != callback) {
        callback.onNetworkError(e);
    }else {
        super.onNetworkError(e);
    }
}