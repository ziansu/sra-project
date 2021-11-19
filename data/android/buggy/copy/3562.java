private void loadConvMessages() {
    java.lang.String converseId = getNormalizedConverseId(myempId, conv.getEmpid());
    chats = com.cviac.com.cviac.app.datamodels.ConvMessage.getAll(converseId);
    chatAdapter = new com.cviac.com.cviac.app.adapaters.ConvMessageAdapter(chats, this);
    lv.setAdapter(chatAdapter);
}