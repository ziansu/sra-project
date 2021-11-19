public void sendMessageToClient(zillacorp.dbModel.Message message) {
    while (!(hasHistoryBeenSent)) {
    } 
    java.lang.String serializedMessage = new com.google.gson.Gson().toJson(message);
    outputToClient.println(serializedMessage);
}