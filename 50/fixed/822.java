public void showAllConversations() {
    updateAllConversations(true);
    for (final codeu.chat.common.ConversationSummary c : summariesByUuid.values()) {
        codeu.chat.client.ClientConversation.printConversation(c, userContext);
    }
}