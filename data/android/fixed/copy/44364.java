public void setFlash(boolean flag) {
    mFlashState = flag;
    if ((mCamera) != null) {
        toggleTorch(flag);
    }
}