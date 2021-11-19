@java.lang.Override
protected org.bukkit.conversations.Prompt acceptValidatedInput(org.bukkit.conversations.ConversationContext context, java.lang.String choice) {
    context.setSessionData("type", choice);
    return new me.A5H73Y.Parkour.Conversation.LeaderboardConversation.ChooseAmount();
}