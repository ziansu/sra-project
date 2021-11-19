public static com.bccs.bsecure.ConversationManager.ConversationHelper getConversation(java.lang.String number) {
    com.bccs.bsecure.ConversationManager.sInstance.addMasterRecord(number);
    return new com.bccs.bsecure.ConversationManager.ConversationHelper(com.bccs.bsecure.ConversationManager.sInstance, number);
}