public synchronized void killCamera() {
    if ((mCamera) == null)
        return ;
    
    mCamera.stopPreview();
    mCamera.release();
    mCamera = null;
    mCameraState = com.luzi82.clockcam.CameraManager.CameraState.NULL;
}