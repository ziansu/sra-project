private void stopPreview() {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.CameraView.TAG, "stopPreview()");
    camera.startPreview();
    inPreview = false;
    getHost().autoFocusUnavailable();
    camera.stopPreview();
}