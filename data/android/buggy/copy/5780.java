void pause() {
    camera.stopPreview();
    camera.setPreviewCallback(null);
    camera.release();
    android.util.Log.d("", "pause: camera released");
}