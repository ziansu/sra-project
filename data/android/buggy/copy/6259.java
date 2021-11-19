@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    mCameraListener.onPictureTaken(data);
    capturingImage = false;
    camera.startPreview();
}