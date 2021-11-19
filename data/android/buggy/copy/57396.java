@java.lang.Override
protected void onPause() {
    super.onPause();
    getFragmentManager().popBackStack();
    mIsRunning = false;
}