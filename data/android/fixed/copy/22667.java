@java.lang.Override
public void onError(android.hardware.camera2.CameraDevice camera, int error) {
    if ((camera != null) && ((cameraDevice) != null)) {
        cameraDevice.close();
    }
    cameraDevice = null;
}