private void releaseCamera() {
    if ((camera) != null) {
        camera.setPreviewCallback(null);
        camera.release();
        camera = null;
    }
}