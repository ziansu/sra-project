private void sendToScroll() {
    mHandler.removeMessages(0);
    isManual = false;
    if (isAutoScroll)
        startAutoScroll(mBannerInterval);
    
}