private boolean hasBusyDevice() {
    java.util.List<nodomain.freeyourgadget.gadgetbridge.impl.GBDevice> devices = nodomain.freeyourgadget.gadgetbridge.GBApplication.getDeviceManager().getDevices();
    for (nodomain.freeyourgadget.gadgetbridge.impl.GBDevice device : devices) {
        if (device.isBusy()) {
            return true;
        }
    }
    return false;
}