private void processMessages(java.util.List<br.edu.ifspsaocarlos.sdm3.messenger.data.Message> messages) {
    if (!(messages.isEmpty())) {
        mConversationDetailView.showMessages(messages);
    }
}