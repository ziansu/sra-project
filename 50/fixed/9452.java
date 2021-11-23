@java.lang.Override
protected void updateDeviceProfile(final org.sump.device.logicsniffer.DeviceProfile aProfile) {
    this.listening = false;
    try {
        updateDeviceType(aProfile);
        updateFields();
        updateConfig(false);
    } finally {
        this.listening = true;
    }
}