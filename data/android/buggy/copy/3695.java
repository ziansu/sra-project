public void stopBanner() {
    if ((mHandler) != null) {
        mHandler.removeCallbacksAndMessages(null);
        isPlaying = false;
    }
}