@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mGetImageAsyncTask) != null) {
        mGetImageAsyncTask.cancel(true);
    }
    mImageProducer.stopImageFetch();
}