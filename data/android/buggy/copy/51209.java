void stopRepeatingTask() {
    mHandler.removeCallbacks(mStatusChecker);
}