public void removeCamera(dascode.Camera cam) {
    cams.remove(cam);
    com.github.sarxos.webcam.ds.ipcam.IpCamDeviceRegistry.unregister(cam.getCameraName());
}