public void setHandleButtonState(final com.cooper.wheellog.BluetoothLeService mBluetoothLeService, final boolean handleButtonEnable) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setHandleButton(handleButtonEnable).writeBuffer();
}