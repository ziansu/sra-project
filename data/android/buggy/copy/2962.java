@java.lang.Override
protected void saveToModel() {
    super.saveToModel();
    if (camera.isDirty()) {
        camera.setDeviceIndex(camera.getDeviceIndex());
    }
}