@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    mSession = session;
    postUpdateFlashlight();
}