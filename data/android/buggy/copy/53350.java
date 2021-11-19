@java.lang.Override
public void onPause() {
    if (inPreview) {
        camera.stopPreview();
    }
    camera.release();
    camera = null;
    inPreview = false;
    super.onPause();
}