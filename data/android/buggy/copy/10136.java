public void onCameraUnavailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(true);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is in use!");
}