public void setTiltHorizon(final int tiltHorizon) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setTiltHorizon(tiltHorizon).writeBuffer();
}