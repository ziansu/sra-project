public void onSwipeProgress(float progress) {
    android.util.Log.w("Progress", ("> " + progress));
    if ((mProgressListener) != null)
        mProgressListener.onSwipeProgress(getCurrentPosition(), progress);
    
    animateStackOnProgress(progress, false, 0);
}