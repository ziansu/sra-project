public void createNewRunningProtocol(java.lang.String userId, java.lang.String farmId, java.lang.String protocolId, java.util.ArrayList<com.vetoquinol.vetosynch.AnimalEntry> animals, java.util.Date dateToStart, android.content.Context context) {
    new com.vetoquinol.vetosynch.RunningProtocolModel.CreateRunningProtocolThread(userId, farmId, protocolId, animals, dateToStart, context).start();
}