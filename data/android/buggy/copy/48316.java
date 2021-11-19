@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    DisableCameraView(opencvCameraView);
    bluetoothCommunication.CloseConnection();
    bluetoothDeviceControlProcesser.StopProcess();
}