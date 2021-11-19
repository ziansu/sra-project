@java.lang.Override
protected void onProgressUpdate(java.lang.Integer... values) {
    int progress = values[0];
    if (progress > (mLastProgress)) {
        mForkListener.onProgress(progress, values[1]);
        mLastProgress = progress;
    }
}