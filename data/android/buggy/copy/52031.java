@java.lang.Override
public void updateConversation(@org.jetbrains.annotations.NotNull
com.criptext.monkeykitui.conversation.MonkeyConversation conversation) {
    com.criptext.monkeychatandroid.models.ConversationItem conversationItem = ((com.criptext.monkeychatandroid.models.ConversationItem) (conversation));
    conversationItem.lastOpen = lastOpen;
    activeConversationItem.setTotalNewMessage(0);
    activeConversationItem.setSecondaryText(lastMessageText);
}