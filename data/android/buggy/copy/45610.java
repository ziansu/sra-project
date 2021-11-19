private void sendMessage(java.lang.String message) throws java.lang.Exception {
    java.lang.String jsonMsg = this.gson.toJson(message);
    toClient.writeBytes(jsonMsg);
}