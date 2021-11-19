@java.lang.Override
public void onConfigured(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session) {
    try {
        session.capture(captureBuilder.build(), null, backgroundHandler);
    } catch (android.hardware.camera2.CameraAccessException e) {
        timber.log.Timber.e(e);
    }
}