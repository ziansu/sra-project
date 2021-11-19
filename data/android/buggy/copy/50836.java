private void startBackgroundThread() {
    mBackgroundThread = new android.os.HandlerThread("CameraBackground");
    mBackgroundThread.start();
    mBackgroundHandler = new android.os.Handler(mBackgroundThread.getLooper());
}