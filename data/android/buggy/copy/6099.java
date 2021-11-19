public void addConversation(uk.org.mattford.scoutlink.model.Conversation conv) {
    android.util.Log.d("SL", ("Adding " + (conv.getName())));
    conversations.put(conv.getName(), conv);
}