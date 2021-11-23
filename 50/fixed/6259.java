@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    synchronized(this) {
        mCameraListener.onPictureTaken(data);
        capturingImage = false;
        camera.startPreview();
    }
}