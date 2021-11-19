public void showAllConversations() {
    updateAllConversations(false);
    for (final codeu.chat.common.ConversationSummary c : summariesByUuid.values()) {
        codeu.chat.client.ClientConversation.printConversation(c, userContext);
    }
}