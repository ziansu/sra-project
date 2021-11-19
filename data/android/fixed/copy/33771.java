public java.util.LinkedHashSet<codeu.chat.common.ConversationHeader> getCopyOfConversationHeaders() {
    hasConversationModified = false;
    return new java.util.LinkedHashSet(conversationHeaders);
}