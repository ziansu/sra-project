@java.lang.Override
public co.blustor.gatekeepersdk.devices.Response get(java.lang.String cardPath) throws java.io.IOException {
    return get(co.blustor.gatekeepersdk.devices.GKBluetoothCard.RETR, cardPath, createDataFile());
}