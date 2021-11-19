@java.lang.Override
public void onPause() {
    super.onPause();
    mHandler.removeCallbacks(mUpdateTimeTask);
    if (mBound) {
        getActivity().unbindService(mConnection);
        mBound = false;
    }
}