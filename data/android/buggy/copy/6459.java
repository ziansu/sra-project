public void addChat(java.lang.String chatId) {
    if ((chats) == null) {
        chats = new java.util.ArrayList<>();
    }
    chats.add(chatId);
    project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this, null);
}