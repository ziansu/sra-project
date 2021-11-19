private void stopScreenCapture() {
    dismissNotification();
    releaseEncoders();
    closeSocket();
    if ((mVirtualDisplay) == null) {
        return ;
    }
    mVirtualDisplay.release();
    mVirtualDisplay = null;
}