public void writeBinaryByte(byte data) {
    try {
        outputStream.write(data);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}