public void handleIncomingCommand(javax.json.JsonObject object) {
    this.serialConnection.writeSerialData(object.getString("command"));
}