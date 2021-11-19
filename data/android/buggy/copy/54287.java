@java.lang.Override
public void writeBytes(byte[] out) {
    btService.write(out);
    alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtConnectorPort.hex.BtConnPortListener listener = ((alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtConnectorPort.hex.BtConnPortListener) (getPortListener()));
    listener.onMessageSent();
}