public void getAllAssociations() {
    org.openhab.binding.zwave.internal.protocol.SerialMessage serialMessage = getGroupingsMessage();
    if (serialMessage != null) {
        getController().sendData(serialMessage);
    }
}