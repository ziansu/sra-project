public static synchronized boolean initializeHeaders() {
    if ((com.roboclub.robobuggy.serial.RBSerialMessage.headers) == null) {
        com.roboclub.robobuggy.serial.RBSerialMessage.instance = new com.roboclub.robobuggy.serial.RBSerialMessage();
        com.roboclub.robobuggy.serial.RBSerialMessage.headers = new com.google.gson.JsonObject();
    }
    return true;
}