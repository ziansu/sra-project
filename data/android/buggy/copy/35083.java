@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((mSyncTask) != null) {
        mSyncTask.cancel(true);
    }
    if ((mMsc) != null) {
        mMsc.disconnect();
    }
}