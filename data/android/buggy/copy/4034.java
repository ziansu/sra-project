@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    CameraManager.singleInstance.close(backCameraIndex);
    CameraManager.singleInstance.close(frontCameraIndex);
    callbackThread.quit();
}