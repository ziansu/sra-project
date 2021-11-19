@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    if ((mSurface) != null) {
        mSession = session;
        postUpdateFlashlight();
    }
}