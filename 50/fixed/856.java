@java.lang.Override
public void onCameraUnavailable(@android.support.annotation.NonNull
java.lang.String cameraId) {
    super.onCameraUnavailable(cameraId);
    updateUnavailableCameras(("" + cameraId), true);
}