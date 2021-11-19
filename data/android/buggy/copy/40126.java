protected void retry() {
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, "[retry()]");
    (retryCount)++;
    error = null;
    checkSession();
}