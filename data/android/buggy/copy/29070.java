public void setTiltHorizon(final com.cooper.wheellog.BluetoothLeService mBluetoothLeService, final int tiltHorizon) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setTiltHorizon(tiltHorizon).writeBuffer();
}