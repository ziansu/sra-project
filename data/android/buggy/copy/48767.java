protected void onFlashModesLoaded() {
    if ((getCurrentCameraPosition()) != (BaseCaptureActivity.CAMERA_POSITION_FRONT)) {
        invalidateFlash();
    }
}