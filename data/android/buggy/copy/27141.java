public void removeAllCams() {
    cams.clear();
    com.github.sarxos.webcam.ds.ipcam.IpCamDeviceRegistry.unregisterAll();
}