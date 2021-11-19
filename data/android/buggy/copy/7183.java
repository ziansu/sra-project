public void setResolution() {
    disconnectCamera();
    mMaxHeight = 240;
    mMaxWidth = 320;
    connectCamera(getWidth(), getHeight());
}