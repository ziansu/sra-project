private void addDelayOperation(int delayMillis) {
    if (!(mDelayed)) {
        java.lang.System.out.println("delayed");
        mDelayed = mHandler.postDelayed(mDisconnectRunnable, delayMillis);
    }
}