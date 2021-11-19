private void sendMessage(java.lang.String query) {
    org.fossasia.susi.ai.model.ChatMessage chatMessage = new org.fossasia.susi.ai.model.ChatMessage(query, true, false);
    updateDatabase(query, true, false);
    recyclerAdapter.addMessage(chatMessage, true);
    computeOtherMessage(query);
}