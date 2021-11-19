public void start() {
    mCameraService.addObserver(this);
    mOrientationProvider.start();
}