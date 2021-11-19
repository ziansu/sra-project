private void releaseCamera() {
    if ((camera) != null) {
        camera.release();
        camera = null;
    }
}