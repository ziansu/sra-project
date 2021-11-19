private void removeDelayOperation() {
    if (mDelayed) {
        java.lang.System.out.println("remove delayed");
        mHandler.removeCallbacks(mDisconnectRunnable);
        mDelayed = false;
    }
}