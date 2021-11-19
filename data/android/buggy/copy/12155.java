public void startVirtual() {
    if ((mMediaProjection) != null) {
        virtualDisplay();
    }else {
        setUpMediaProjection();
        virtualDisplay();
    }
}