void pause() {
    camera.stopPreview();
    camera.setPreviewCallback(null);
    camera.release();
}