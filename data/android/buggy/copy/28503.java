@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    android.media.Image image = cameraImageReader.acquireNextImage();
    java.lang.System.out.println("Woohoo");
    unlockFocus();
}