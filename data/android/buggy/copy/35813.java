private void callbackProgressInternal(int progress) {
    android.util.Log.i(com.hans.doublewaybubbleseekbar.DoubleWaySeekBar.TAG, ("callbackProgressInternal: " + progress));
    if ((mListener) != null) {
        mListener.onSeekProgress(progress);
    }
}