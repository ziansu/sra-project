@java.lang.Override
protected org.bukkit.conversations.Prompt acceptValidatedInput(org.bukkit.conversations.ConversationContext context, java.lang.String choice) {
    if (choice.equals("Cancel"))
        return org.bukkit.conversations.Prompt.END_OF_CONVERSATION;
    
    context.setSessionData("type", choice);
    return new me.A5H73Y.Parkour.Conversation.LeaderboardConversation.ChooseAmount();
}