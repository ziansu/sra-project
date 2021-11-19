void setCamera(org.gearvrf.GVRCamera camera) {
    mCamera = camera;
    camera.setOwnerObject(null);
    org.gearvrf.GVRActivity.nativeSetCamera(appPtr, camera.getNative());
}