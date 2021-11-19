private void write(byte[] bytes) {
    try {
        port.writeBytes(bytes);
    } catch (jssc.SerialPortException e) {
        processing.app.Serial.errorMessage("write", e);
    }
}