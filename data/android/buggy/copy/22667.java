@java.lang.Override
public void onError(@android.support.annotation.NonNull
android.hardware.camera2.CameraDevice camera, int error) {
    cameraDevice.close();
    cameraDevice = null;
}